package sample;
import java.util.*;

public class ExcepHand {
 static double accNo;
String userName;
String accType;
int balance=0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    Bank obj = new Bank();
		obj.setAccNo(45678)	;
		obj.setUserName("Anuja");
		obj.setAccType("Savings");
		obj.setBalance(40000);
		System.out.println("1.Account creation ");
		System.out.println("2.Search Account");
		System.out.println("3.deposit money");
		System.out.println("4.withdrawal amount");
		
int choice;
System.out.println("enter the choice");
choice = sc.nextInt();
int amount;
switch (choice) {
case 1:
System.out.println("enter some details for creating an account");
obj.getAccNo();
obj.getUserName();
obj.getAccType();
obj.getBalance();

System.out.println("account created");
System.out.println(
"account No=" + obj.getAccNo() + "\n User Name=" + obj.getUserName()
+ "\naccount Type=" + obj.getAccType() + "\nBalance=" + obj.getBalance());
break;

case 2:
	System.out.println("enter the account u want to search");
	accNo = sc.nextDouble();
	try {
	if (obj.getAccNo() == accNo) {
	System.out.println("account found");
	} else {
	throw new Exception();
	}
	}

	catch (Exception e) {
	System.out.println("account is not found");
	System.out.println("Exception raised");

	}
	break;
	
case 3:
	System.out.println("enter the account you want to deposite");
	accNo = sc.nextDouble();
	try {
		
		if (obj.getAccNo() == accNo) {
		System.out.println("account found");
		System.out.println("enter the amount u want to deposit");
		amount = sc.nextInt();
		try {

		if (amount > 0) {
		System.out.println("total balance is:" + (obj.getBalance() + amount));
		}

		else {
		throw new Exception();
		}
		}
		catch(Exception e) {
			System.out.println("negative amount");
		}
		}
		 else {
		throw new Exception();
		}

		}

		catch (Exception e) {
		System.out.println("account not found");
		}
	
		break;
		
		case 4:
	
		System.out.println("enter the account u want to withdraw");
		accNo = sc.nextInt();

		try {
		if (obj.getAccNo() == accNo) {
		System.out.println("account found");
		System.out.println("enter the amount u want to withdraw");
		amount = sc.nextInt();
		try {
		if (amount > 0) {

		if (obj.getBalance() >= amount) {

		System.out.println("total balance is" + (obj.getBalance() - amount));
		}

		else {

		throw new Exception();
		}
		} else {
		System.out.println("ammount cant withdrawn");
		}
		} catch (Exception e) {
		System.out.println("amount is insufficient");
		System.out.println("Transaction failed");
		}
		}


		else {
		throw new Exception();
		}
		} catch (Exception e) {
		System.out.println("account not found");
		}

		break;
		default:
		System.out.println("please enter the correct choice");
		break;

		}
	
while (choice != -1);

	}
}