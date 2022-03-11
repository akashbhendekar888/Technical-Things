package Test_Inheritance;



public class College {            //parent/super/base class
	int collegeId=541420;
	String collegeName="Vishawbharti Vidyalaya";                             
	public void empolyees() {
		System.out.println(collegeId+" ::Total Employee of college ::");
		}
	public void collegeBranch() {
		 System.out.println("Branch::Computer,Electrical,Information Technology,Automobile ");
	}
	public void collegeStaf() {
		System.out.println("Total professor staf is ::");
	}

}
 class Students extends College{                      // derive/sub/grant child class Single level  inheritance 
    void studId(int id) {
    	System.out.println(collegeId+" "+collegeName+" ID of students::"+id);
    }
    void studResult() {
    	System.out.println(collegeId+" "+collegeName+"Score of Students ");
    }
     

}
 class Subjects extends Students{                     // child class Multilevel Inheritance
	 
	 void physics() { 
		 System.out.println(collegeId+" ::Physics Notes ");
	 }
 }
class Main{                                          //driver class
	public static void main(String args[]) {//driver method 
		Subjects s=new Subjects();                      //Create Object of Last class
		s.empolyees();
		s.collegeStaf();
		s.collegeBranch();
	    s.studId(12);
	    s.studResult();
	    s.physics();
		
	}
}