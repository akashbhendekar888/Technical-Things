package com.tnsif.Client;

import Application.MMBankFactory;
import Application.MMCurrentAcc;
import Application.MMSavingAcc;

public class AccountHolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MMBankFactory mbf=new MMBankFactory();
		mbf.getNewSavingAccount(85456, "Akash", 4000, true);
		mbf.getNewCurrentAccount(1111, "Akshay", 1000, 500);
		
		MMSavingAcc saving=new MMSavingAcc(1000, "Akash",5000, false);
		saving.diposite(5000);
		saving.withdraw(2000);
		saving.getAccBal();
		saving.getAccNm();
		saving.getAccNo();
		saving.toString();
		
		
		MMCurrentAcc current=new MMCurrentAcc(6566, "Akash", 4000, 500);
		current.diposite(5000);
		current.withdraw(2000,10000);
		current.getAccBal();
		current.getAccNm();
		current.getAccNo();
		current.toString();
		

	}

}
