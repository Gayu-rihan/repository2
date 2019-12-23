package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrive {

	public static void main(String[] args) {
		Connection conn;
		PreparedStatement stmt;
		Statement st;
		ResultSet rs ;
		int duration =4;
		int custId;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
			st=conn.createStatement();
			custId = st.executeUpdate("SELECT seq1.NEXTVAL FROM DUAL");
			stmt=conn.prepareStatement("insert into table3 values(?,?,?)");
			stmt.setInt(1, custId);
			stmt.setInt(2, 40000);
			stmt.setInt(3, 8);
			stmt.execute();
			
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}


}
