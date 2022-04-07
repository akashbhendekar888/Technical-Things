package LambdaExpression;
interface Drawable{
	public void draw();
}
public class TestLambdaExpression {            //provide implementation functional interface and less coding

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width=20;
		
		/*Without lambdaExpression
		 Drawable d=new Drawble();
		 public void draw(){
		 System.out.println("Drawble width"+width);
		 }
		 d.draw();
		 */
		
		
		//lambdaExpression
		Drawable d=()->{System.out.println("Drawable width "+width);};
		d.draw();

	}

}
