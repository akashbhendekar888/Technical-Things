package Banking_operation;

import java.util.Scanner;

public class menu {
	int selectOption;
	
	banking_account b=new banking_account();
	
	public void showMenu() {
		
		System.out.println("Press 1 Deposite Your Amount:");
		System.out.println("Press 2 Withdraw Your Amount:");
		System.out.println("Press 3 View Balance:");
		System.out.println("Press any key to Exit ");
		System.out.println(" ");
		Scanner scan =new Scanner(System.in);
		System.out.println("Press Any Key");
		selectOption =scan.nextInt();
		
	switch(selectOption) {	
	case 1:
		 System.out.println("Enter Your Diposite Amount:");
	     deposite d=new deposite();
	     int depamt=scan.nextInt();
	     b.add(depamt);
	     showMenu();
	     break;
	case 2:
		System.out.println("Enter Your Withdraw Amount:");
		int withamt=scan.nextInt();
		b.withdraw(withamt);
		showMenu();
		break;
		
		
	case 3:
		System.out.println("Your Account Balance is : "+b.getBalance()+" Rupees");
		System.out.println(" ");
		showMenu();
	default:
		System.out.println("Transaction Ended ,Logout your Account Successfully!");
		System.exit(0);
		break;
	
		
	}
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	


