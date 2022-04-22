package com.tnsif.framework;

public abstract class NormalAcc extends ShopAcc {
   
     public final float deliveryCharges;
	
     public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}


	public void bookProduct(float charges) {
    	 
     }

	
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", accNo=" + accNo + ", accNm=" + accNm + ", charges="
				+ charges + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
