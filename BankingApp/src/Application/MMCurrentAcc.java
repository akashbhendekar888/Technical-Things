package Application;

import Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal,creditLimit);
	
		// TODO Auto-generated constructor stub0
	}

	public void withdraw(float accBal,float creditLimit) {
		System.out.println("Dear Account Holder Your Current Account Balance is::"+accBal+"Your Credit limit is::"+creditLimit);
		
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", toString()="
				+ super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()="
				+ getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

	
}
