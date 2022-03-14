package TestVariable_DataTypes;

public class Person {
     static String name="Satej Patil";  //static variable-do not change assign values
      String job="Software Analyst";    //instance variable-instance to class
      
    static  void personDetails(int age,float hight) {   //local variable-declare in method
    	  System.out.println(name+"\n" +"age::"+age);
    	  }
    
        void display() {
        	System.out.println("JOb::"+job);
        }
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Person p=new Person();
         personDetails(24,5.6f);      //static method is do not need calling  object 
         p.display();
	}

}
