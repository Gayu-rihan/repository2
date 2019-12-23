package com.prodapt.xyz.dao;

import com.prodapt.xyz.bean.Customer;
import com.prodapt.xyz.bean.Loan;

//Create interface for LoanDao
public interface ILoanDao {

	public long loanApply(Loan loan);

	public long addCustomer(Customer customer);
}
