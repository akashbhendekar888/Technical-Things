
public class Looping {
	
	public static void main(String args[]) {
		/*for (int i=0;i<5;i++) {                   // for loop -When you know how many times you want to loop
		                                               through a block of code, use the for loop instead of a while loop:
			System.out.println("java is Fun");		
			}
		*/
		/*int a =10,sum;
		for(int i=0;i<10;i++) {
		    sum=a*i;
			System.out.println(sum);
		}*/
		/*for(int i=1;i<=5;i++) {      
			for (int j=1;j<=i;j++) {
				
				System.out.print("@");
			}
			System.out.println();
		}*/
		int n=0;
		/*while(n<10) {                    //The while loop loops through a block of code as long as a specified condition is true:
			System.out.println(n);
			n++;
		}*/
		do {                            /*The do/while loop is a variant of the while loop. This loop will execute the code block once,
			                             before checking if the condition is true, 
			                           then it will repeat the loop as long as the condition is true.*/
			System.out.println(n);
			n++;
			}
		while(n<10);
	}
}


