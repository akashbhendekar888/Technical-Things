

public class stack {
	private static int top;
	private static int a[];
	
	public static  int  pushTop(int n) {
        top=n;
		for (int i=1;i<10;i++) {
			a[10]=n+i;
			return 1;
		}
		System.out.println("Push Value:"+a[10]);
		return -1;
	}
	public static int popTop(int n) {
		top=n;
		for(int i=0;i<10;i++) {
			a[10]=top-1;
			return -1;
			
		}
		System.out.println("Pop Value"+a[10]);
		return 1;
		
	}
public static void main (String args[]) {
	try {
	stack sk=new stack();
	stack.pushTop(2);
	stack.pushTop(3);
	stack.pushTop(4);
	stack.pushTop(5);
	stack.popTop(2);
	stack.popTop(3);
	stack.popTop(4);
	stack.popTop(5);
	
}

catch(Exception e) {e.printStackTrace();}
}
}

