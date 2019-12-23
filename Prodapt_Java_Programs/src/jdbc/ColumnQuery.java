package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ColumnQuery {
	public static void main(String[] args) 
	{
		Connection conn;
		Statement stmt;
		ResultSet rs ;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from student"); //customer==your table name
			
			while(rs.next()) {
				System.out.println(rs.getInt("roll_no")+" "+rs.getString("name")+" "+rs.getInt("age"));//table values
			}
			
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
