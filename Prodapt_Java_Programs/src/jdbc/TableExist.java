package jdbc;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.*;

public class TableExist {

	public static void main(String[] args) {

		 
		 Connection conn = null;
		 Statement stmt =null;
		 PreparedStatement pstmt=null;
		 try{
		    //STEP 2: Register JDBC driver
		    Class.forName("oracle.jdbc.driver.OracleDriver");

		    //STEP 3: Open a connection
		    System.out.println("Connecting to a selected database...");
		    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
		    System.out.println("Connected database successfully...");
		    DatabaseMetaData dbm = conn.getMetaData();
			// check if "employee" table is there
			ResultSet tables = dbm.getTables(null,null,"table2",null);
			if (tables.next()) {
				pstmt = conn.prepareStatement("insert into table2 values(?,?,?,?,?)");
				pstmt.setInt(1,101 );
				pstmt.setString(1,"gaya");
				pstmt.setString(1,"b" );
				pstmt.setInt(1,21 );
				pstmt.execute();
			}
			else {
			  // Table does not exist
				//STEP 4: Execute a query
			    System.out.println("Creating table in given database...");
			    stmt = conn.createStatement();
			    
			    String sql = "CREATE TABLE table2 " +
			                 "(id INTEGER not NULL, " +
			                 " first VARCHAR(255), " + 
			                 " last VARCHAR(255), " + 
			                 " age INTEGER, " + 
			                 " PRIMARY KEY ( id ))"; 

			    stmt.executeUpdate(sql);
			    System.out.println("Created table in given database...");
			}
			 }catch(SQLException se){
			    //Handle errors for JDBC
			    se.printStackTrace();
			 }catch(Exception e){
			    //Handle errors for Class.forName
			    e.printStackTrace();
			 }finally{
			    //finally block used to close resources
			    try{
			       if(stmt!=null)
			          conn.close();
			    }catch(SQLException se){
			    }// do nothing
			    try{
			       if(conn!=null)
			          conn.close();
			    }catch(SQLException se){
			       se.printStackTrace();
			    }//end finally try
			 }//end try
			 System.out.println("Goodbye!");
			}//end main
			}//end JDBCExample
			

