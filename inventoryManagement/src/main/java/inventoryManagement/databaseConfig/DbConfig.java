package inventoryManagement.databaseConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
	private Connection con;
	private static DbConfig dbConfig;

	public DbConfig() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getCon() {
		return con;
	}

	public static DbConfig getDbConfig() {
		if (dbConfig == null) {
			dbConfig = new DbConfig();
			return dbConfig;
		} else {
			return dbConfig;
		}
	}

	@Override
	public void finalize() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
