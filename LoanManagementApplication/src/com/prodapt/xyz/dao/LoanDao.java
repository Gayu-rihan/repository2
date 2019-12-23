package com.prodapt.xyz.dao;

import java.util.Map;
import java.util.TreeMap;
import com.prodapt.xyz.bean.Customer;
import com.prodapt.xyz.bean.Loan;
import com.prodapt.xyz.db.Database;

public class LoanDao implements ILoanDao {

	private Map<Long, Customer> customerDetails;
	private Map<Long, Loan> loanDetails;
	Database db = new Database();

	// Storing Customer details in map.
	@Override
	public long addCustomer(Customer customer) {
		customerDetails = new TreeMap<Long, Customer>();
		customerDetails.put(customer.getCustId(), new Customer(customer.getCustName(), customer.getAddress(),
				customer.getEmail(), customer.getMobile()));
		// Returns customer Id to LoanService
		return db.custDb(customer);
	}

	// Storing loan details in map.
	@Override
	public long loanApply(Loan loan) {
		loanDetails = new TreeMap<Long, Loan>();
		loanDetails.put(loan.getLoanID(), new Loan(loan.getLoanAmount(), loan.getDuration(), loan.getCustId()));
		// Returns loan Id to LoanService
		return db.loanDb(loan);
	}

}
