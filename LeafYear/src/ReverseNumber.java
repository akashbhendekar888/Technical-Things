import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse=0,remainder;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number::");
		int num1=sc.nextInt();
		for(;num1!=0;) {
			remainder=num1;
			reverse=reverse*10+remainder;
			num1=num1/10;
			
			
		}
		System.out.println(reverse);
		

	}

}
