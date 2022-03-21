import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
     	System.out.println("Enter Your Age::");
		
		int age=scan.nextInt();                           //Decision Making Statement if ,else if,else
		if(age>18&& age<120) {
			System.out.println("You are eligble for voting");  //conditions to perform different actions for different decisions.
		}
			else if(age<=18 && age>=1) {
				System.out.println("You are Not eligible for voting");				
			}
		
		else {System.out.println("Invalid Input");}	}

}
     /*	if(age>=21 && age<=120) {
     		System.out.println("Ready to get  Married!");
     	}
     	else if (age<21 && age>0) {
     		System.out.println("Wait for it kiddo!");
     	}else {
     		System.out.println("You entered Invalid Age .Please Enter Valid Age ");
     	}
	}
}*/

