import java.util.Scanner;

public class TestLeafYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter an Year::");
	int year=scan.nextInt();
	if(((year %  4 ==0)&&( year % 100!=0))||(year % 400 ==0)) 
		System.out.println("Specified Year is Leap Year:");
		
		
   else 
		System.out.println("Specified Year is not Leap Year");
	
	

	}

}
