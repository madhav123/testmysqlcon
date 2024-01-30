package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Testing {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		 String url = "jdbc:mysql://localhost:3307/mysql";
		 String username = "root";
		 String password = "12345";

		 System.out.println("Connecting database ...");
	     Class.forName("com.mysql.cj.jdbc.Driver"); // Use com.mysql.jdbc.Driver if you're not on MySQL 8+ yet.

		 try (
				 
				 Connection connection = DriverManager.getConnection(url, username, password))
		 {
		     System.out.println("Database connected!");
		 } catch (SQLException e) {
		     throw new IllegalStateException("Cannot connect the database!", e);
		 }

	}

}
