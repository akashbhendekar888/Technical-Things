package LambdaExpression;
interface Simple{
	public void first();
}
public class TestLambdaExpe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Simple s1=()->{System.out.println("Hello World");};
       
	
	s1.first();
	}
}
