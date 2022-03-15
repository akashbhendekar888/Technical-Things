package BookDestribution;

public class Distrubution_Details {    
	private void studId() {                   //private access modifires -access only within class   
		System.out.println("123445");
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Distrubution_Details dd=new Distrubution_Details();
    dd.studId();
	}

}
