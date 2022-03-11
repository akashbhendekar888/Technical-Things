package TestPolyMorphism;

public class Management_School {                   //method Overloading Program
	static void display()                         //display method
	{
		System.out.println("Salary Section ::");
	}
	
	 void salary(String name,int salaryOfAccountant) {            
		
		System.out.println("Salary Of Accountant::"+name+"::"+salaryOfAccountant);
		}
	 void salary(String name,long salaryOfProfessor,int bonus ) {            //same method name different parameter
		
		System.out.println("Salary of Professor"+"::"+name+"::"+salaryOfProfessor+"::"+bonus);
	}
	 void salary(String name,double salaryOfClerk,int overTime) {              //method Overloading 
	
		System.out.println("Salary of Clerk"+name+"::"+salaryOfClerk+"::"+overTime);
		}



	public static void main(String[] args) {
		Management_School ms=new Management_School();     //create an Object
		display();                               
		ms.salary("Beyon Ironside",50000);              //call methods 
		ms.salary("Ivar Boneless",45000,4000);
		ms.salary("Vistarg lorthbroke",35000,300);
		
		
		

		
	}

}
