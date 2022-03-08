
public class Student {
	int rollNo;
	String name;
	String branch;
	
	void display() {
		System.out.println("Students Details");
	}
	public int getRollNo() {
		return rollNo;
		
	}
	public String getName() {
		return name;
		
	}
	public String getBranch() {
		return branch;
	}
	public void setRollNo(int n) {
		rollNo=n;
		
	}
	public void setName(String s) {
		name=s;
		
	}	
	public void setBranch(String b) {
			branch=b;
	
	}	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student details=new Student();
		 
		details.setRollNo(20);
		details.setName("Ragnar lorthbrok");
		details.setBranch("Computer Science");
		
		
		System.out.println("Student Roll Number ::"+details.getRollNo());
		System.out.println("Student Name ::"+details.getName());
		System.out.println("Student Branch ::"+details.getBranch());
		
		
		

	}

}
