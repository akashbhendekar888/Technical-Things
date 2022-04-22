package com.tnsif.framework;

public  class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}

	public void bookProduct(float charges) {
		
		
	}
	
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
