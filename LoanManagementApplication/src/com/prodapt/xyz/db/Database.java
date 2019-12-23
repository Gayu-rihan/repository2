package com.prodapt.xyz.db;

import java.sql.*;
import com.prodapt.xyz.bean.Customer;
import com.prodapt.xyz.bean.Loan;
import com.prodapt.xyz.main.MainApplication;

public class Database {
	Connection conn;
	PreparedStatement pstmt;
	Statement stmt = null;
	ResultSet rs;
	MainApplication mp= new MainApplication();

	// Storing customer details in customer table.
	public long custDb(Customer customer) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");

			DatabaseMetaData dbm = conn.getMetaData();
			// check if "employee" table is there
			ResultSet tables = dbm.getTables(null, null, "CUSTOMER", null);
			if (tables.next()) {
				pstmt = conn.prepareStatement("insert into Customer values(?,?,?,?,?)");
				pstmt.setLong(1, customer.getCustId());
				pstmt.setString(2, customer.getCustName());
				pstmt.setString(3, customer.getAddress());
				pstmt.setString(4, customer.getEmail());
				pstmt.setLong(5, customer.getMobile());
				rs=pstmt.executeQuery();
			} else {
				// If Table does not exist
				stmt = conn.createStatement();
				String sql = "CREATE TABLE Customer(custId NUMBER(30) PRIMARY KEY, CustName VARCHAR(25), Address VARCHAR(35), Email VARCHAR(30),Mobile NUMBER(15))";
				stmt.executeUpdate(sql);
				pstmt = conn.prepareStatement("insert into customer values(?,?,?,?,?)");
				pstmt.setLong(1, customer.getCustId());
				pstmt.setString(2, customer.getCustName());
				pstmt.setString(3, customer.getAddress());
				pstmt.setString(4, customer.getEmail());
				pstmt.setLong(5, customer.getMobile());
				pstmt.executeUpdate();
			}
			conn.close();
			// returns customer ID to LoanDao
			return customer.getCustId();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}
		return 0;
	
	}

	// Storing loan details in loan table.
	public long loanDb(Loan loan) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");

			DatabaseMetaData dbm = conn.getMetaData();
			// check if "employee" table is there
			ResultSet tables = dbm.getTables(null, null, "LOAN", null);
			if (tables.next()) {
				pstmt = conn.prepareStatement("insert into Loan values(?,?,?,?)");
				pstmt.setLong(1, loan.getLoanID());
				pstmt.setDouble(2, loan.getLoanAmount());
				pstmt.setInt(3, loan.getDuration());
				pstmt.setLong(4, loan.getCustId());
				pstmt.execute();
			} else {
				// If Table does not exist
				stmt = conn.createStatement();
				String sql = "create table Loan (LoanId NUMBER(20),Amount NUMBER(10),Duration NUMBER(5),CustId NUMBER(30),foreign key(custId) references customer(custId))";
				stmt.executeUpdate(sql);
				pstmt = conn.prepareStatement("insert into Loan values(?,?,?,?)");
				pstmt.setLong(1, loan.getLoanID());
				pstmt.setDouble(2, loan.getLoanAmount());
				pstmt.setInt(3, loan.getDuration());
				pstmt.setLong(4, loan.getCustId());
				pstmt.executeUpdate();
			}
			conn.close();
			// returns Loan ID to LoanDao
			return loan.getLoanID();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
				
	}
	
	public void deleteCustomer(String custName) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
			stmt=conn.createStatement();
			String sql=("delete from customer where custName='%s'",custName);
			int r=stmt.executeUpdate(sql); //customer==your table name
			System.out.println(r+"   rows gets affected");
			
			//connection close();
			conn.close(); 
 
			}catch(Exception e){ 
				System.out.println(e);} 

			} 
	

}
