package modelo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.DTO.Alumno;

public class AlumnoDAO {
	private Connection conexion;

	public List<Alumno> listarTodosLosAlumnos() {
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		// Crear objeto Statement
		String sql = "SELECT * FROM ALUMNO ORDER BY id;";
		try (Statement statement = conexion.createStatement();) {
			// Crear objeto ResultSet
			ResultSet resulset = statement.executeQuery(sql);
			while (resulset.next()) {
				Alumno alumno = new Alumno(resulset.getString(1), resulset.getString(2), resulset.getInt(3),
						resulset.getString(4));
				listaAlumnos.add(alumno);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaAlumnos;
	}

	public boolean insertarAlumno(Alumno alumno) {
		int resultado = 0;

		String sql = "INSERT INTO ALUMNO VALUES (?,?,?,?)";

		try (PreparedStatement psStatement = conexion.prepareStatement(sql);) {

			psStatement.setString(1, alumno.getNombre());
			psStatement.setString(2, alumno.getApellidos());
			psStatement.setInt(3, alumno.getTelefono());
			psStatement.setString(4, alumno.getDni());

			resultado = psStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado == 1;

	}

	public boolean borrarAlumno(int id) {
		int borrados = 0;

		String sql = "DELETE FROM ALUMNO WHERE id = ?;";
		try (PreparedStatement preparedStatement = conexion.prepareStatement(sql);) {
			preparedStatement.setInt(1, id);

			borrados = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return borrados != 0;

	}

	public boolean actualizarAlumno(String nombre, String apellidos, int telefono, String dni, int id) {
		int updates = 0;

		String sql = "UPDATE ALUMNO SET nombre = ?, apellidos = ?, telefono = ?, dni = ? WHERE id = ?;";
		try (PreparedStatement preparedStatement = conexion.prepareStatement(sql);) {
			preparedStatement.setString(1, nombre);
			preparedStatement.setString(2, apellidos);
			preparedStatement.setInt(3, telefono);
			preparedStatement.setString(4, dni);
			preparedStatement.setInt(5, id);

			updates = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return updates != 0;

	}

	public boolean insertarListaAlumnos(List<Alumno> listaAlumnos) {

		for (Alumno alumno : listaAlumnos) {
			insertarAlumno(alumno);
		}

		return true;
	}
}
