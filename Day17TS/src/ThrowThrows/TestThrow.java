package ThrowThrows;

public class TestThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=12;
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to vote");    
		}
		else {  
            System.out.println("Person is eligible to vote!!");  
            }
		System.out.println("Rest of code");

}
}
