package Banking_System;

public class TestFinal_Super_Keyword {
	   final long college_id=143534;                //final keyword-use declare final class,variable,method -assign fix
	   int college_totalStudent;                    // can't ovveride
	    final void  collegeName(String name) {
	    	System.out.println("College Name::"+name);
	    	System.out.println("College ID::"+college_id);
	    }
}    
 
 class college_staff extends TestFinal_Super_Keyword{
	 void  total_staff(int total) {
		super.college_totalStudent=590;       //super keyword-access variable ,method ,constructor-in subclass from a parent class
		System.out.println("Total Student of College::"+college_totalStudent);
		System.out.println("College Total Staff ::"+total);
	 }
	 
 }
 class LibraryDetails extends college_staff{
	 void  total_books(int a ) {
		 
		super.college_totalStudent=6776;
		System.out.println("Total Student of College::"+college_totalStudent);
		  System.out.println("Total books in library::"+a);
		 }
 }
 class Test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryDetails ld=new LibraryDetails();
		ld.collegeName("Adsul Technical campus");
		ld.total_books(324);
		ld.total_staff(90);
	}

}
