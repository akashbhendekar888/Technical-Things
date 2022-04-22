package com.tnsif.ApplicationPart;

import com.tnsif.framework.PrimeAcc;

public class GsPrimeAcc extends PrimeAcc{
	
	public GsPrimeAcc(int accNo, String accNm, float b, boolean isPrime) {
		super(accNo, accNm, b, isPrime);
		// TODO Auto-generated constructor stub
	}


	private static final float charges=0;
	

	public void bookProduct(float charges) {
		System.out.println("Dear Prime User Your Product charges are::"+charges);
	}


	@Override
	public String toString() {
		return "GsPrimeAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
