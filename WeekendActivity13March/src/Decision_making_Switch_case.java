import java.util.Scanner;

public class Decision_making_Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the Month Number::");
		int x=scan.nextInt();
		
		switch(x) {                            //Use the switch statement to select one of many code blocks to be executed.
		case 1:System.out.println("Janevary");
		break;
		case 2:System.out.println("February");
		break;
		case 3:System.out.println("March");
		break;
		case 4:System.out.println("April");
		break;
		case 5:System.out.println("May");
		break;
		case 6:System.out.println("June");
		break;
		case 7:System.out.println("july");
		break;
		case 8:System.out.println("August");
		break;
		case 9:System.out.println("September");
		break;
		case 10:System.out.println("October");
		break;
		case 11:System.out.println("November");
		break;
		case 12:System.out.println("December");
		break;
		default:System.out.println("You Enter Invalid Month");
			break;
		}
	 }
}