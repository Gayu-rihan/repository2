package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteMultipleRows {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String status;
		Connection conn;
		Statement stmt;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
			stmt=conn.createStatement();
			status = sc.next();
			System.out.println("Do you want to continue delete    :(Y/N)");
			while(status.equalsIgnoreCase("Y")) {
			System.out.println("Enter the age that needed to be deleted   :");
			int age1 = sc.nextInt();
			int r=stmt.executeUpdate("delete from student where age=%d",age1); //customer==your table name
			System.out.println(r+"   rows gets affected");
			System.out.println("Do you want to continue delete    :(Y/N)");
			status = sc.next();
		
			}
		}
			catch(SQLException e){ 
				System.out.println(e);
			} 
			catch(ClassNotFoundException e){ 
				System.out.println(e);
			} 
		sc.close();
		} 

}
