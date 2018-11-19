package modelo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.DTO.ProfesorPOJO;

public class ProfesorDAO {
	private Connection conexion;

	public List<ProfesorPOJO> listarTodosLosProfesores() {
		List<ProfesorPOJO> listaProfesores = new ArrayList<ProfesorPOJO>();
		// Crear objeto Statement
		String sql = "SELECT * FROM PROFESOR ORDER BY id;";
		try (Statement statement = conexion.createStatement();) {
			// Crear objeto ResultSet
			ResultSet resulset = statement.executeQuery(sql);
			while (resulset.next()) {
				ProfesorPOJO profesor = new ProfesorPOJO(resulset.getInt(1), resulset.getString(2),
						resulset.getString(3));
				listaProfesores.add(profesor);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaProfesores;
	}

	public boolean insertarProfesor(ProfesorPOJO profesor) {
		int resultado = 0;

		String sql = "INSERT INTO PROFESOR VALUES (?,?)";

		try (PreparedStatement psStatement = conexion.prepareStatement(sql);) {

			psStatement.setString(1, profesor.getNombre());
			psStatement.setString(2, profesor.getApellidos());

			resultado = psStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado == 1;

	}

	public boolean borrarProfesor(int id) {
		int borrados = 0;

		String sql = "DELETE FROM PROFESOR WHERE id = ?;";
		try (PreparedStatement preparedStatement = conexion.prepareStatement(sql);) {
			preparedStatement.setInt(1, id);

			borrados = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return borrados != 0;

	}

	public boolean actualizarProfesor(String nombre, String apellidos, int telefono, String dni, int id) {
		int updates = 0;

		String sql = "UPDATE PROFESOR SET nombre = ?, apellidos = ? WHERE id = ?;";
		try (PreparedStatement preparedStatement = conexion.prepareStatement(sql);) {
			preparedStatement.setString(1, nombre);
			preparedStatement.setString(2, apellidos);

			preparedStatement.setInt(3, id);

			updates = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return updates != 0;

	}

	public boolean insertarListaProfesores(List<ProfesorPOJO> listaProfesores) {

		for (ProfesorPOJO profesor : listaProfesores) {
			insertarProfesor(profesor);
		}

		return true;
	}
}
