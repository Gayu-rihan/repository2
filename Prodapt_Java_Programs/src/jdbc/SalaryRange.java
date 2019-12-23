package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SalaryRange {
	public static void main(String[] args) {
		Connection conn;
		Statement stmt;
		ResultSet rs;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from employee where salary > 25000"); //customer==your table name
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));//table values
			}
			//connection close();
			conn.close(); 

			}catch(Exception e){ System.out.println(e);} 

			} 
	
}
