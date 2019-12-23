package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class JdbcProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn;
		Statement stmt;
		PreparedStatement ps;
		ResultSet rs;
		
		int r = 0;
		int roll=0,age=0;
		String name1;
		String ch = null;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
			stmt=conn.createStatement(); 
			rs=stmt.executeQuery("select * from student"); //customer==your table name
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));//table values
			}
			
			r=stmt.executeUpdate("insert into student(roll_no,name,age) values(roll,name1,age)");
			System.out.println("inserted row "+r++);
			
			System.out.println("Do you want to insert row? (Y/N)");
			ch = sc.next();
			
			while(ch.equalsIgnoreCase("Y")) {
			System.out.println("Enter roll no: ");
			roll = sc.nextInt();
			System.out.println("Enter name: ");
			name1 = sc.next();
			System.out.println("Enter age: ");
			age = sc.nextInt();
			r=stmt.executeUpdate("insert into student(roll_no,name,age) values(roll,name1,age)");
			System.out.println("inserted row "+r++);
			
			ch = sc.next();	
			}
			//connection close();
			conn.close(); 
 
			}catch(Exception e){ System.out.println(e);} 

			} 
	}

