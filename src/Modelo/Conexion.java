package Modelo;

import java.sql.*;

public class Conexion {
	
	Connection connection; 
	Statement statement;
	public PreparedStatement preparedStatement;
	String urlString="jdbc:mysql://localhost:3306/mobilitydb";
	
	public Conexion() {
	}
	
	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {	
			System.out.println("Error al cargar el controlador... "+e);
		}
		
		try {
			connection = DriverManager.getConnection(urlString,"root","");
			System.out.println("Conexion realizada con exìto");
		} catch (Exception e) {
			System.out.println("Error al hacer la conexion... "+e);
		}
	}
	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}	
}