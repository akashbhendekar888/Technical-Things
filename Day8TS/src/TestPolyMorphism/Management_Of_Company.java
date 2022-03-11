package TestPolyMorphism;

public class Management_Of_Company {                //method overriding program
	void display() {
		System.out.println("Payments Of All Type Of Employee");
	}
}
	 class Project_Employee{                      
	void payment(int salary,int bonus) {
		System.out.println("Salary Of Project Employer::"+salary+"::"+bonus);
	}
	}
	class Superviser{                                      //same method name different class 
		 void payment(int salary,int bonus) {
			System.out.println("Salary Of Supervisers::"+salary+"::"+bonus);
		}
	}
	class Manager{
		void payment(int salary,int bonus) {                                 //same method name and same parameters
			System.out.println("Salary Of Managers::"+salary+"::"+bonus);
			
		}
	}
	class Details{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Management_Of_Company moc=new Management_Of_Company();
		System.out.println(moc instanceof Management_Of_Company); //use instanceof operator to check object instance or not
		moc.display();
		
		Superviser s=new Superviser();
		s.payment(47000,4000);
		s.payment(40000,4000);            //call override methods
		s.payment(50000,4000);

	}

}
