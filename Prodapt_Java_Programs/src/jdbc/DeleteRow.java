package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteRow {
	public static void main(String[] args) {
		Connection conn;
		Statement stmt;
		ResultSet rs;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
			stmt=conn.createStatement();
			int r=stmt.executeUpdate("delete from student where age<20"); //customer==your table name
			System.out.println(r+"   rows gets affected");
			
			//connection close();
			conn.close(); 
 
			}catch(Exception e){ System.out.println(e);} 

			} 
	
}
