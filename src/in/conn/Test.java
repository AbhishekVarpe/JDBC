package in.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logipool", "root", "123213Abhi@");
		System.out.println("Connection is connect");
		String queryString = "SELECT * FROM student;";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(queryString);
		System.out.println(" query fire");

		while (rs.next())
		{
			System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
		}
		System.out.println("close");
		rs.close();
		stmt.close();
		conn.close();
	}
}
