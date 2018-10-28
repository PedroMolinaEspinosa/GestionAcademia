package modelo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.DTO.Asignatura;

public class AsignaturaDAO {
	private Connection conexion;

	public List<Asignatura> listarTodosLasAsignaturas() {
		List<Asignatura> listaAsignaturas = new ArrayList<Asignatura>();
		// Crear objeto Statement
		String sql = "SELECT * FROM ASIGNATURA ORDER BY id;";
		try (Statement statement = conexion.createStatement();) {
			// Crear objeto ResultSet
			ResultSet resulset = statement.executeQuery(sql);
			while (resulset.next()) {
				Asignatura asignatura = new Asignatura(resulset.getString(1), resulset.getInt(2),
						resulset.getString(3));
				listaAsignaturas.add(asignatura);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaAsignaturas;
	}

	public boolean insertarAsignatura(Asignatura asignatura) {
		int resultado = 0;

		String sql = "INSERT INTO ASIGNATURA VALUES (?,?,?)";

		try (PreparedStatement psStatement = conexion.prepareStatement(sql);) {

			psStatement.setString(1, asignatura.getNombre());
			psStatement.setInt(2, asignatura.getCurso());
			psStatement.setString(3, asignatura.getCiclo());

			resultado = psStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado == 1;

	}

	public boolean borrarAsignatura(int id) {
		int borrados = 0;

		String sql = "DELETE FROM ASIGNATURA WHERE id = ?;";
		try (PreparedStatement preparedStatement = conexion.prepareStatement(sql);) {
			preparedStatement.setInt(1, id);

			borrados = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return borrados != 0;

	}

	public boolean actualizarAsignatura(String nombre, int curso, String ciclo, int id) {
		int updates = 0;

		String sql = "UPDATE ASIGNATURA SET nombre = ?, curso = ?, ciclo = ? WHERE id = ?;";
		try (PreparedStatement preparedStatement = conexion.prepareStatement(sql);) {
			preparedStatement.setString(1, nombre);
			preparedStatement.setInt(2, curso);
			preparedStatement.setString(3, ciclo);
			preparedStatement.setInt(4, id);

			updates = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return updates != 0;

	}

	public boolean insertarListaAsignaturas(List<Asignatura> listaAsignaturas) {

		for (Asignatura asignatura : listaAsignaturas) {
			insertarAsignatura(asignatura);
		}

		return true;
	}
}
