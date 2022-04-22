package Framework;

public abstract class BankAcc {
 protected int accNo;
 protected String accNm;
 protected float accBal;
 
 public BankAcc(int accNo, String accNm, float accBal) {
	super();
	this.accNo = accNo;
	this.accNm = accNm;
	this.accBal = accBal;
}
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getAccNm() {
	return accNm;
}
public void setAccNm(String accNm) {
	this.accNm = accNm;
}
public float getAccBal() {
	return accBal;
}
public void setAccBal(float accBal) {
	this.accBal = accBal;
}
public void withdraw(float accBal) {
	 
 }
 public void diposite(float accBal) {
	 
 }
@Override
public String toString() {
	return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
}
 
 
}
