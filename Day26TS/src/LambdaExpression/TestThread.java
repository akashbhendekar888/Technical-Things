package LambdaExpression;

public class TestThread {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// without lambda expression
		Runnable r1=new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Thread is running");
			
		}
		};
		Thread t1=new Thread(r1);
		t1.start();
		
		//with lambda expression
		Runnable r2=()->{System.out.println("Thread is running");};
	Thread t=new Thread(r2);
	t.start();

}
}