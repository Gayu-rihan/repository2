package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcProgram1 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt;
		ResultSet rs;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
			PreparedStatement ps=conn.prepareStatement("Insert into student(roll_no,name,age) values(?,?,?)");
			ps.setInt(1,sc.nextInt());
			ps.setString(2,sc.next());
			ps.setInt(3,sc.nextInt());
			
			int rows=ps.executeUpdate();
			System.out.println("Number of rows inserted		:"+rows);
			//connection close();
			
 
			}catch(Exception e){
				System.out.println(e);
				} 
			finally {
				conn.close(); 
			} 
			
			}

	}


