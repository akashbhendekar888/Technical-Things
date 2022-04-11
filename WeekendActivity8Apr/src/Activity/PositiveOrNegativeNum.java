package Activity;

import java.util.Scanner;

public class PositiveOrNegativeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number::");
		int a=scan.nextInt();
		
		if(a>0) {
			System.out.println("The Number is postive ");
			
		}else if(a<0){
			System.out.println("The  Number is Negative");
			
		}
		else {
			System.out.println("The Number is Zero ");
		}
		

	}

}
