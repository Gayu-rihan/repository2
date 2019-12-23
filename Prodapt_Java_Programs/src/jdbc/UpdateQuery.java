package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateQuery {
	public static void main(String[] args) {
		Connection conn;
		Statement stmt;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
			stmt=conn.createStatement();
			int r=stmt.executeUpdate("update student set location='us' where roll_no=27");
			System.out.println(r+"    Rows gets affected");
			
			//connection close();
			conn.close(); 
 
			}catch(Exception e){ System.out.println(e);} 

			} 
}
