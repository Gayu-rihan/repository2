package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn;
		PreparedStatement ps;
		ResultSet rs;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
			ps=conn.prepareStatement("Insert into student(roll_no,name,age) values(?,?,?)");
			ps.setInt(1,sc.nextInt());
			ps.setString(2,sc.next());
			ps.setInt(3,sc.nextInt());
			//ps=conn.prepareStatement("Insert into student(roll_no,name,age) values(%d,'%s',%d)",roll,sname,sage);
			int rows=ps.executeUpdate();
			System.out.println("Number of rows inserted		:"+rows);
			//connection close();
			conn.close(); 
 
			}catch(Exception e) {
					System.out.println(e);
				} 

			} 
}
