package com.tnsif.ApplicationPart;

import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.PrimeAcc;
import com.tnsif.framework.ShopFactory;

public class GSShopFactory implements ShopFactory {

	 public GsPrimeAcc getNewPrimeAccount(int accNo,String accNm,float charges,boolean b) {
		GsPrimeAcc gsprime=new GsPrimeAcc(accNo, accNm, charges, false);
		return gsprime;
		 
	 }
	 public GSNormalAcc getNewNormalAccount(int accNo,String accNm,float charges,float dileveryCharges) {
		 GSNormalAcc gsnormal=new GSNormalAcc(accNo, accNm,charges, dileveryCharges);
		 return gsnormal;
		 
	 }
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, float isPrime) {
		// TODO Auto-generated method stub
		return null;
	}
}
