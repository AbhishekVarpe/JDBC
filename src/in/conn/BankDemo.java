package in.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BankDemo {

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ptmp = null;
        Scanner sc=new Scanner(System.in);

        try {
                connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/logipool", 
                    "root", 
                    "123213Abhi@");
            System.out.println("Connected successfully");
            String query = "CREATE TABLE IF NOT EXISTS bank ("
                         + "id INT PRIMARY KEY AUTO_INCREMENT, "
                         + "name VARCHAR(40), "
                         + "mark INT)";
            
            // 3. Use the query variable
            ptmp = connection.prepareStatement(query);
            ptmp.execute();
            
            ptmp=connection.prepareStatement("insert into bank(id,name,mark) values(?,?,?);");
            System.out.println("Enter the id");
            int id=sc.nextInt();
            ptmp.setInt(1, id);
            
            System.out.println("Enter the name");
            String name=sc.next();
            ptmp.setString(2, name);
            
            System.out.println("");
            
            
            System.out.println("Enter the mark");
            int mark=sc.nextInt();
            ptmp.setInt(3, mark);
            
          
            ptmp.execute();

            System.out.println("Table created successfully.");
            
            

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 4. Clean up resources
            try {
                if (ptmp != null) ptmp.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
