package Banking_System;                                              // interface is a another way of achieving the abstraction

 interface Account_Details {                                         // create interface using interface keyword
	                                                                 //interface is blueprint of a class,it is fully abstracted 
   void accountNumber();                                             //default abstract and public  method in interface 
	void accountName();
	

}
  interface AtmDetails{
	 void atmNO() ;
 }

 class Bank_Account implements Account_Details{                       /*interface implementation -which one class extends the another class 
                                                                         and implement the interface seprated by coma */
	public void accountNumber(){
		long accNum=299234923;
		System.out.println("Account Number ::"+accNum);
		}
	public void accountName() {
		String name="Atharv Patil";
		System.out.println("Account Holder Name::"+name);
		
	}
	public void display() {
		System.out.println("Thank you");
	}
	}
class Account_Documents extends Bank_Account implements Account_Details,AtmDetails{     //Multiple inheritance achieve through interface implementation
	public void atmNO() {
		long b=8818233;
		System.out.println("ATM number of ::"+b);
		
		
	}

}
class Test_Account {
	public static void main(String []args) {
		Account_Documents ad=new Account_Documents();
		ad.accountName();
		ad.accountNumber();
		ad.atmNO();
		ad.display();
		
	}
		
		
}