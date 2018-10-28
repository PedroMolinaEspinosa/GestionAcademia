package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public static Connection conexion() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String jdbcURL = "jdbc:oracle:thin:@orasrv:1521:XE";
			conn = DriverManager.getConnection(jdbcURL, "damuser23", "damuser");
		} catch (ClassNotFoundException ex) {

		}
		return conn;
	}

}