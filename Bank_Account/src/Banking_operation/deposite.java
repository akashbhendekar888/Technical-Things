package Banking_operation;

import java.util.Scanner;

public class deposite {
	int amt =0;
	public int userInput() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Amount to be deposited");
		amt=s.nextInt();
	
		if(amt<0) {
			invalid_transaction depositeFailed=new invalid_transaction("Invalid User Input");
			
		}else {
			return amt;
		}
		return amt;
		
		
	}
	
}
