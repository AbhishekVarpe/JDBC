package in.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class BatchDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/BatchDemo","root","123213Abhi@");
		
		Statement stmt=connection.createStatement();
//		String query="create table Bdemo(id int primary key, name varchar(39),age int);";
//		stmt.execute(query);
//		System.out.println("table is created");
//		
//		stmt.addBatch("insert into Bdemo values(1,'abhishekvarpe',22);");
//		stmt.addBatch("insert into Bdemo values(2,'abhishekvarpe',22);");
//		stmt.addBatch("insert into Bdemo values(3,'abhishekvarpe',22);");
//		stmt.addBatch("insert into Bdemo values(4,'abhishekvarpe',22);");
//		stmt.addBatch("insert into Bdemo values(5,'abhishekvarpe',22);");
//		stmt.addBatch("insert into Bdemo values(6,'abhishekvarpe',22);");
//		stmt.addBatch("insert into Bdemo values(7,'abhishekvarpe',22);");
//		stmt.addBatch("insert into Bdemo values(8,'abhishekvarpe',22);");
//		stmt.addBatch("insert into Bdemo values(9,'abhishekvarpe',22);");
//		stmt.addBatch("insert into Bdemo values(10,'abhishekvarpe',22);");
//		stmt.addBatch("insert into Bdemo values(11,'abhishekvarpe',22);");
//		stmt.addBatch("insert into Bdemo values(12,'abhishekvarpe',22);");
//		stmt.addBatch("insert into Bdemo values(13,'abhishekvarpe',22);");
//		stmt.addBatch("insert into Bdemo values(14,'abhishekvarpe',22);");
//		stmt.addBatch("insert into Bdemo values(15,'abhishekvarpe',22);");
//		stmt.executeBatch();
//		System.out.println("record insert successfully in the database");
		
		
        PreparedStatement pre= connection.prepareStatement("insert into bdemo values(?,?,?);");
        pre.setInt(1, 20);
        pre.setString(2, "bhakti");
        pre.setInt(3, 20);
        pre.execute();
        System.out.println("In throught prestampt");
		
	}

}
