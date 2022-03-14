package TestKeyword;

import java.util.Scanner;

public class company_hire_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter The Percentage::");
		int answerPercentage=scan.nextInt();
		
		if(answerPercentage>90 && answerPercentage<=100) {System.out.println("You have given great interview .You Will have got Offer letter soon from Our Company");}
		
		 else if(answerPercentage>=80 && answerPercentage<=90) {System.out.println(" You have given better interview. You Will Have got hired soon in our company");}
		
		 else if(answerPercentage>=70 && answerPercentage<80) {System.out.println("You Will Inform soon");}
		
		 else if(answerPercentage>=60 && answerPercentage<70) {System.out.println("You Will Inform soon");}
		
		 else if(answerPercentage<60 && answerPercentage>0) {System.out.println("You have need take some efforts .Thank you for giving your time ");}
							
							else {System.out.println("Invalid Input");}

         }
}
