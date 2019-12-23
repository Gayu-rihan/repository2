package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateMultipleRows {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to update rows?    (Y/N)");
		String ch = sc.next() ;
		int roll;
		String sname;
		int count=0;
		int r;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
			Statement stmt;
			stmt=conn.createStatement();
			while(ch.equalsIgnoreCase("Y")) {
				System.out.println("Enter roll_no and location to update row :");
				roll=sc.nextInt();
				sname=sc.next();
				String sql=String.format("insert into student(roll_no,name) values(%d,'%s')",roll,sname);
				r=stmt.executeUpdate(sql);
				if(r==1)
					count++;
				System.out.println(r + "Rows affected");
				System.out.println("Do you want to insert row: (Y/N)");
				ch = sc.next();
			}
			System.out.println("Total rows inserted		:"+count);
			conn.close();
		}catch(SQLException e) {
			System.out.println(e);
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		sc.close();
	}
}
