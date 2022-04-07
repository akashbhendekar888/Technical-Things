package LambdaExpression;
interface Sayble{
	public String say(String name);
}
public class LambdaExpression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Lambda expression with single parameter.  
		
		Sayble bl=name->{return "Hello"+name;};
		System.out.println(bl.say(" Akash"));

	}

}
