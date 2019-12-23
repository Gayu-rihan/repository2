package com.prodapt.xyz.main;

import java.util.Scanner;
import com.prodapt.xyz.bean.Customer;
import com.prodapt.xyz.bean.Loan;
import com.prodapt.xyz.db.Database;
import com.prodapt.xyz.service.LoanService;

public class MainApplication {

	//Loan Application process starts here
	void loanApplication() {
		Scanner input = new Scanner(System.in);
		Loan loan = new Loan();
		Database db=new Database();
		Customer customer = new Customer();
		LoanService loanService = new LoanService();
		int choice;
		System.out.println("XYZ Finance Company welcomes you \n" + "1.Register Customer \n" + "2.Delete Customer \n" + "2.Exit");
		// Getting choice from customer
		System.out.println("Enter your option : ");
		choice = input.nextInt();
		do {
			switch (choice) {
			case 1:
				//Getting customer details from user
				System.out.println("Enter Customer Name:	");
				customer.setCustName(input.next());
				System.out.println("Enter Address:	");
				customer.setAddress(input.next());
				System.out.println("Enter Email:	");
				customer.setEmail(input.next());
				System.out.println("Enter Mobile Number:	");
				customer.setMobile(input.nextLong());
				//validating customer details
				long customerId = loanService.validateCustomer(customer);
				int flag = loanService.flag;
				//If customer details are valid then loan process continues 
				if (flag > 3) {
					long customerID = loanService.addCustomer(customer);
					System.out.println("Customer Information saved successfully. Your Customer Id is:	XYZ_" + customerID);

					System.out.println("\nDo you wish to apply for Loan?(Yes/No)");
					String choice1 = input.next();
					//If YES then loan process continues
					if (choice1.equalsIgnoreCase("YES")) {
						System.out.println("Enter loan amount:	");
						loan.setLoanAmount(input.nextDouble());
						System.out.println("Enter the loan duration:	");
						loan.setDuration(input.nextInt());
						double EMI = loanService.calculateEMI(loan.getLoanAmount(), loan.getDuration());
						System.out.println("For loan amount\t" + loan.getLoanAmount() + "\tand " + loan.getDuration()
								+ "  Years duration. You EMI per month will be     " + EMI);
						System.out.println("\nDo you wish to apply for Loan?(Yes/No)");
						String option = input.next();
						//If customer applies for loan then loan id will be generated
						if (option.equalsIgnoreCase("YES")) {
							long loanId = loanService.applyLoan(loan, customer);
							System.out.println("Your loan request is generated.Your Loan ID is:\t" + loanId);
							input.close();
						}
					//If customer don't want to apply for loan then their details will be displayed
					} else if (choice1.equalsIgnoreCase("NO")) {
						System.out.println("Customer Id is:	" + customer.getCustId());
						System.out.println("Name is:	" + customer.getCustName());
						System.out.println("Address is:	" + customer.getAddress());
						System.out.println("Mobile number is:	" + customer.getMobile());
						System.out.println("Email is:	" + customer.getEmail());
					}

				} else {
					System.out.println("\n\n\nEnter details properly.");
					System.out.println("\nDo you want to continue?(Yes/No)");
					String option = input.next();
					if (option.equalsIgnoreCase("YES")) {
						loanApplication();
					} else {
						System.exit(0);
					}
				}
			case 2:
				//Delete customer info
				System.out.println("Enter the name that needed to be done:	");
				String custId=input.next();
				db.deleteCustomer(custId);
				break;
			case 3:
			//Exit from process
			System.exit(0);
		}
		} while (true);
	}

	public static void main(String[] args) {
		MainApplication main = new MainApplication();
		//Process starts here
		main.loanApplication();
	}

}
