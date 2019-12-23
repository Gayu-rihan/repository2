package com.prodapt.xyz.service;

import com.prodapt.xyz.bean.Customer;
import com.prodapt.xyz.bean.Loan;

//Creating interface for loanService
public interface ILoanService {
	public long addCustomer(Customer customer);

	public long applyLoan(Loan loan, Customer customer);

	public long validateCustomer(Customer customer);

	public double calculateEMI(double amount, int duration);
}
