package com.prodapt.xyz.service;

import com.prodapt.xyz.dao.ILoanDao;

import com.prodapt.xyz.dao.LoanDao;
import com.prodapt.xyz.db.Database;
import com.prodapt.xyz.exceptions.InValidAddressException;
import com.prodapt.xyz.exceptions.InValidEmailAddressException;
import com.prodapt.xyz.exceptions.InValidMobileNumberException;
import com.prodapt.xyz.exceptions.InValidNameException;
//import com.prodapt.xyz.exceptions.InValidAddressException;
//import com.prodapt.xyz.exceptions.InValidMobileNumberException;
//import com.prodapt.xyz.exceptions.InvalidNameException;
import com.prodapt.xyz.bean.Customer;
import com.prodapt.xyz.bean.Loan;
import java.util.Random;

public class LoanService implements ILoanService {
	// creating instance for dao for accessing methods
	ILoanDao loanDao = new LoanDao();
	Loan loan = new Loan();
	Database db = new Database();
	public int flag = 0;
	String custId;

	public long validateCustomer(Customer customer) {
		// Validating customer name
		boolean nameStatus = customer.getCustName().matches("[a-zA-Z]*");
		if (!nameStatus) {
			try {
				throw new InValidNameException("Invalid Name");
			} catch (InValidNameException e) {
				System.out.println(e);
			}
		} else
			flag++;

		// Validating customer address
		boolean addressStatus = customer.getAddress().matches("[a-zA-Z0-9]*");
		if (!addressStatus) {
			try {
				throw new InValidAddressException("Invalid Address");
			} catch (InValidAddressException e) {
				System.out.println(e);
			}
		} else
			flag++;

		// Validating customer email ID
		boolean emailStatus = customer.getEmail().matches("^([0-9a-z.]{5,15})@([a-z]{2,15})\\.([a-z]{2,3})$");
		if (!emailStatus) {
			try {
				throw new InValidEmailAddressException("Invalid Email Address");
			} catch (InValidEmailAddressException e) {
				System.out.println(e);
			}
		} else
			flag++;

		// validating customer mobile number
		boolean mobileNoStatus = Long.toString(customer.getMobile()).length() == 10;
		if (!mobileNoStatus) {
			try {
				throw new InValidMobileNumberException("Invalid Mobile Number");
			} catch (InValidMobileNumberException e) {
				System.out.println(e);
			}
		} else
			flag++;

		// If there is no exception then customer Id will be returned to calling
		// method(main program)
		if (flag > 0) {
			return customer.getCustId();
		} else
			return 0;
	}

	public long addCustomer(Customer customer) {
		Random random = new Random();
		customer.setCustId(Math.abs((random.nextInt())));
		// Returns customer Id to calling method(main program)
		return loanDao.addCustomer(customer);
	}

	public long applyLoan(Loan loan, Customer customer) {
		// generating random numbers for loan id
		Random random = new Random();
		loan.setLoanID(Math.abs((random.nextLong())));
		loan.setCustId(customer.getCustId());
		// Returns loan Id to calling method(main program)
		return loanDao.loanApply(loan);
	}

	public double calculateEMI(double amount, int duration) {
		double emi;
		double r = 9.5 / 100;
		// Calculating emi
		emi = amount * r * (1 + r) * duration / ((1 + r) * duration - 1);
		// Returns emi to calling method(main program)
		return emi;
	}
}
