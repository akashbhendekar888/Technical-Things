package Framework;

public class CurrentAcc extends BankAcc{
	private final float creditLimit;

	

	  

	


	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}



	public void withdraw(float accBal) {
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
