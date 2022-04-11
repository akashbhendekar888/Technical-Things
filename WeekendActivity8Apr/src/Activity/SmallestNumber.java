package Activity;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int fnum=scan.nextInt();
		System.out.println("Enter the second Number");
		int snum=scan.nextInt();
		System.out.println("Enter the third Number");
		int tnum=scan.nextInt();
		
         if(fnum<snum) {
        	 System.out.println("Is the Smallest Number::"+fnum);
        	 
         }
         else if(snum<tnum) {
        	 System.out.println("Is the Smallest Number::"+snum);
        	 
         }else {
        	 System.out.println("Is the Smallest Number::"+tnum);
        	 
         }
		

	}

}
