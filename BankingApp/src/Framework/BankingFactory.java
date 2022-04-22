package Framework;

public interface BankingFactory {
	 SavingAcc getNewSavingAccount(int accNo,String accNm,float accBal,boolean isSalary);
	 CurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal,float creditLimit);

}
