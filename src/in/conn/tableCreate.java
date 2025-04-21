package in.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class tableCreate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logipool", "root", "123213Abhi@");
		System.out.println("Connection is connect");
		String queryString = "CREATE table emp(id int,name varchar(20));";
		Statement stmt = conn.createStatement();
		stmt.execute(queryString);
		System.out.println(" query fire");
		System.out.println("");
		System.out.println("");
}

}
