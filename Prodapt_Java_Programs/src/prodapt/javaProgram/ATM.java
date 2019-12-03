/*
 ENTER YOUR SECRET PIN NUMBER:1520
    ********Welcome to ATM Service**************
    1. Check Balance
    2. Withdraw Cash
    3. Deposit Cash
    4. Quit
    ******************?**************************?*
    
    Enter your choice: 1
    
    YOUR BALANCE IN Rs : 1000
    DO U WISH TO HAVE ANOTHER TRANSCATION?(y/n):
    ********Welcome to ATM Service**************
    1. Check Balance
    2. Withdraw Cash
    3. Deposit Cash
    4. Quit
    ******************?**************************?*
    
    Enter your choice: 2
    
    ENTER THE AMOUNT TO WITHDRAW: 200
    
    
    PLEASE COLLECT CASH
    YOUR CURRENT BALANCE IS 800
    
    DO U WISH TO HAVE ANOTHER TRANSCATION?(y/n):
    ********Welcome to ATM Service**************
    1. Check Balance
    2. Withdraw Cash
    3. Deposit Cash
    4. Quit
    ******************?**************************?*
    
    Enter your choice: 3
    
    ENTER THE AMOUNT TO DEPOSIT 5000
    YOUR BALANCE IS 5800
    
    
    DO U WISH TO HAVE ANOTHER TRANSCATION?(y/n):
    ********Welcome to ATM Service**************
    1. Check Balance
    2. Withdraw Cash
    3. Deposit Cash
    4. Quit
    ******************?**************************?*
    
    Enter your choice: 1
    
    YOUR BALANCE IN Rs : 5800
    
    
    DO U WISH TO HAVE ANOTHER TRANSCATION?(y/n):
    ********Welcome to ATM Service**************
    1. Check Balance
    2. Withdraw Cash
    3. Deposit Cash
    4. Quit
    ******************?**************************?*
    
    Enter your choice: 4
    
    THANK U USING ATM
    
    
    DO U WISH TO HAVE ANOTHER TRANSCATION?(y/n):
    ********Welcome to ATM Service**************
    1. Check Balance
    2. Withdraw Cash
    3. Deposit Cash
    4. Quit
    ******************?**************************?*
    
    Enter your choice: 4
    
    THANK U USING ATM
    
    
    DO U WISH TO HAVE ANOTHER TRANSCATION?(y/n):
    ********Welcome to ATM Service**************
    1. Check Balance
    2. Withdraw Cash
    3. Deposit Cash
    4. Quit
    ******************?**************************?*
    
    Enter your choice: n
    
    THANK U USING ATM
    


*/
package prodapt.javaProgram;

import java.util.Scanner;

public class ATM {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("ENTER YOUR SECRET PIN NUMBER:");
	int pin=sc.nextInt();
	double balance=1000;
	double withDrawal=0;
	double deposit=0;
	String ch="n";
	if(pin==1520) {
		do {
		System.out.print("********Welcome to ATM Service**************\r\n" + 
				"    1. Check Balance\r\n" + 
				"    2. Withdraw Cash\r\n" + 
				"    3. Deposit Cash\r\n" + 
				"    4. Quit\r\n" + 
				"*********************************************\r\n" + 
				"Enter your choice: ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.println("YOUR BALANCE IN Rs : "+balance);
				System.out.println("DO U WISH TO HAVE ANOTHER TRANSCATION?(y/n):" );
				ch=sc.next();
				break;
		case 2:System.out.println("ENTER THE AMOUNT TO WITHDRAW: ");
				withDrawal=sc.nextInt();
				if(withDrawal<balance) {
					balance=balance-withDrawal;
				System.out.println("PLEASE COLLECT CASH\r\n" + 
						"    YOUR CURRENT BALANCE IS " + balance);
				}
				else
					System.out.println("Transaction failed");
				System.out.println("DO U WISH TO HAVE ANOTHER TRANSCATION?(y/n):" );
				ch=sc.next();
		break;
		case 3:System.out.println("ENTER THE AMOUNT TO DEPOSIT \r\n" ); 
				deposit=sc.nextInt();
				balance=deposit+balance;
				System.out.println("YOUR BALANCE IN Rs :" + balance);
				System.out.println("DO U WISH TO HAVE ANOTHER TRANSCATION?(y/n):" );
				ch=sc.next();
			break;
		case 4:System.out.println("THANK U USING ATM");
				System.out.println("DO U WISH TO HAVE ANOTHER TRANSCATION?(y/n):" );
				ch=sc.next();
				break;
		default:System.out.println("Invalid Choice");
		}
		}while(ch.equals("y"));
		
		if(ch.equals("n"))
			System.out.println("THANK U USING ATM");
		
	}
	
	sc.close();
}
}
