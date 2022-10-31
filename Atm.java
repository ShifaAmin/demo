package practice.code.ntsa;
import java.util.*;
public class Atm{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
in.close();
System.out.println("Please insert your card");
System.out.println("hi,please don't remove your atm during transaction");
System.out.println("please select language\npress 1 for english\npress 2 for hindi");
int lang=in.nextInt();
int withdrawal=0;
int deposit=0;
int balance=10000;
int actualpin=1234;
if(lang==1) {
System.out.println("enter your pin");
int pin=in.nextInt();
	if(pin==actualpin) {
	    System.out.println("enter1 for withdrawal\nenter2 to deposit\nenter3 to check balance");
		int n=in.nextInt();
		switch(n) {
		case 1:
			System.out.println("enter amount to be withdrawal");
				withdrawal=in.nextInt();
				if(withdrawal<=balance) {
					balance=balance-withdrawal;
			System.out.println("withdraw your amount and the balance is="+balance);
			System.out.println("please collect your money and card");
				}
				else {
			System.out.println("insufficient balance");
			System.out.println("please collect ur card");
				}
		break;
		case 2:
			System.out.println("enter amount to be deposit");
				deposit=in.nextInt();
				balance=deposit+balance;
			System.out.println("ur amount is deposited and balance="+balance);
			System.out.println("please collect your card");
		break;
		case 3:
			System.out.println("your balance is="+balance);
			System.out.println("please collect your card");
		break;
		    default:
			System.out.println("wrong choice");
			System.out.println("please collect your card");
		break;
			}
	
	}
	else {
		System.out.println("you have entered wrong password");
	}
	
}
}
}