package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private static Connection conexion = null;

	private Conexion() {
		// creamos el objeto conexion (Connection)
		try {
			Class.forName("org.sqlite.JDBC");
			try {
				conexion = DriverManager.getConnection("jdbc:sqlite:resources/baseDeDatosAcademia.bd");
			} catch (SQLException e) {
				System.out.println("Error al acceso de la BD");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc no encotrador");
		}
	}

	public static Connection getInstance() {
		if (conexion == null) {
			new Conexion();
			System.out.println("Conexión establecida");
		}

		return conexion;
	}

}
