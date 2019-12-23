package jdbc;

import java.sql.*;
public class ConditionalQuery {
	public static void main(String[] args) 
	{
		Connection conn;
		Statement stmt;
		ResultSet rs;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select name from student where age>22");
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
