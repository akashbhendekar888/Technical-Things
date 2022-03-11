package TestAbstraction;

public abstract class Result{        //declare abstract class

	abstract  void failStudent() ;   // declare abstract method in only abstract class can't declare without abstract class
	abstract void passStudent();     // abstract method can't have body
	
	void display() {                 //concrete method means method with body
		System.out.println("Follows are college student result");
		}
	}

class Result_10th extends Result{                   
	 public void failStudent() {System.out.println("Failed Student:: ");}
	 
	 public void passStudent() {System.out.println("Pass Student ::");}
}
 class AllStud {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Result_10th crm=new Result_10th();       //abstract class can't instantiate
	   crm.display();
		crm.failStudent();
        crm.passStudent();
	}

}

    //Abstraction is complex details being hidden from the user