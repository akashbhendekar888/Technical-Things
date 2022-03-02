package Banking_operation;

public class banking_account {
	int amount=2000;
	
	public void initiate() {
		login lg=new login();
		try {
			lg.acceptInput();
			lg.verify();
			
			}catch(Exception e) {
				try {
					lg.acceptInput();
					lg.verify();
					
				}catch(Exception f) {}
	}

	}
	public int getBalance() {
	   return amount;
	}
	public void add(int amt) {
		
		amount =amount+amt;
		System.out.println("Amount deposited Succefully");
		
		System.out.println(" ");
		System.out.println("Total amount balance "+amount);
		System.out.println("  " );
	}
	public void withdraw(int amt) {
		System.out.println(" ");
		
		if(amount<amt) {
			invalid_transaction withdrawFailed=new invalid_transaction("Invalid Withdrawl Amount ");
			System.out.println(withdrawFailed.getMsg());
			
			
		}else {amount =amount-amt;System.out.println("Collect Your Amount:"+amt+" Rupees");

		System.out.println("Available balance Is:"+amount);
		System.out.println("  ");
		
		}
		
	}
		
		
	}
		
	
