package jdbc;

import java.sql.*;
import java.util.Scanner;

public class MultipleRows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = null ;
		int count=0;
		int r;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
			while(ch.equalsIgnoreCase("Y")) {
			System.out.println("Do you want to insert row: (Y/N)");
			ch = sc.next();
			PreparedStatement ps=conn.prepareStatement("insert into student(roll_no,name) values(?,?)");
			ps.setInt(1, sc.nextInt());
			ps.setString(2, sc.next());
			r=ps.executeUpdate();
			if(r==1)
				count++;
			System.out.println(r + "Rows affected");
			}
			System.out.println("Total rows inserted		:"+count);
		}catch(SQLException e) {
			System.out.println(e);
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
