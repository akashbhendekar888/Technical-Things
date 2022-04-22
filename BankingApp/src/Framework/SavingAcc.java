package Framework;

public class SavingAcc extends BankAcc {
	boolean isSalary;

	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}


	public void withdraw(float accBal) {
		
	}


	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}