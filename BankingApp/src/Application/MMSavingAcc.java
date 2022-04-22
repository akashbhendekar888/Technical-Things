package Application;

import Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float accBal) {
		System.out.println("Dear Customer Your Saving Account Balance are::"+accBal);
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
