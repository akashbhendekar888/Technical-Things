package com.tnsif.ApplicationPart;

import com.tnsif.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float charges) {
		System.out.println("Dear User Your Product Charges are::"+charges+" with delivery charges::"+deliveryCharges );
		
		
	}

	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public void getDeliveryCharges() {
		// TODO Auto-generated method stub
		
	}

	
}
