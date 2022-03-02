package Banking_operation;
import java.io.*;
import java.util.Scanner;

public class login {
	int accNumber=1212121212;
	int password=231234;
	int acc,pw;
	
	Scanner sc=new Scanner(System.in);

	public void acceptInput() {
		System.out.println("Enter Account Number");
		acc=sc.nextInt();	
		System.out.println("Enter Password");
		pw=sc.nextInt();
	}	
	public void verify()throws Exception {	

		if(acc==accNumber && pw==password) {
			System.out.println("login Successfully");
			
			banking_account b=new banking_account();
			
			System.out.println("   "  );
			System.out.println("Your Balance is:"+b.getBalance()+" Rupees");
			System.out.println("  ");		
			menu m1=new menu();
			m1.showMenu();
		}else {
			invalid_transaction failed=new invalid_transaction("Incorrect login!");
			
		    System.out.println(failed.getMsg());
		    throw new Exception ("Exceptionn handle");}
			
		}
	}
	


