package sample;

public class Bank {
private double accNo;
private String userName;
private String accType;
private int balance=0;

//public Bank(double accNo, String userName, String accType, int balance) {
//	this.accNo = accNo;
//	this.userName = userName;
//	this.accType = accType;
//}

public double getAccNo() {
	return accNo;
}

public void setAccNo(double accNo) {
	this.accNo = accNo;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getAccType() {
	return accType;
}

public void setAccType(String accType) {
	this.accType = accType;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}
}
