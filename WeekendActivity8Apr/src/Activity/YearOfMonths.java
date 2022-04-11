package Activity;
import java.util.Scanner;

public class YearOfMonths {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number of month");
		
		int monthNumber=scan.nextInt();
		
		switch(monthNumber) {
		case 1:System.out.println("January:: 31 days");
		       break;
		case 2:System.out.println("february:: 28 days");
	       break;
		case 3:System.out.println("March:: 31 days");
	       break;
		case 4:System.out.println("April:: 30 days");
	       break;
		case 5:System.out.println("May:: 31 days");
	       break;
		case 6:System.out.println("Jun:: 30 days");
	       break;
		case 7:System.out.println("July:: 31 days");
	       break;
		case 8:System.out.println("August:: 30 days");
	       break;
		case 9:System.out.println("September:: 31 days");
	       break;
		case 10:System.out.println("Octomber:: 30 days");
	       break;
		case 11:System.out.println("November:: 31 days");
	       break;
		case 12:System.out.println("December:: 30 days");
	       break;
	       default:System.out.println("Invalid Input");
	       
		
		}
		

	}

}