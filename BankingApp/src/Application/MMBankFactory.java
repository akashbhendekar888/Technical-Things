package Application;

import Framework.BankingFactory;
import Framework.CurrentAcc;
import Framework.SavingAcc;

public  class MMBankFactory implements BankingFactory {
	public MMSavingAcc getNewSavingAccount(int accNo,String accNm,float accBal,boolean isSalary) {
		MMSavingAcc sa=new MMSavingAcc(accNo, accNm, accBal, isSalary);
		return sa;
	}
	public MMCurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal,float creditLimit) {
	MMCurrentAcc ca=new MMCurrentAcc(accNo, accNm, creditLimit, creditLimit);
    return ca;
}
}