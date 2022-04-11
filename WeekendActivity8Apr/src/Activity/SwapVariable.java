package Activity;



import java.util.Scanner;

public class SwapVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num3;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first Number::");
		int num1=scan.nextInt();
		System.out.println("Enter the second Number::");
		int num2=scan.nextInt();
		System.out.println("Before the swapping elements::"+"\n"+"First Number"+num1+"\n"+"Second number"+num2);
		
		num3=num1;
		num1=num2;
		num2=num3;
		
		System.out.println("After swapping elements::"+num2+" "+num1);
	}

}
