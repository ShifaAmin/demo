package practice.code.ntsa;
import java.util.*;
public class Calculator {

	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int a,b,sum,diff,multiply,division;
		System.out.println("enter 1st nd 2nd no.");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("enter 1 for sum\nenter 2 for difference\nenter 3 for multiplication\nenter 4 for division");
		System.out.println("enter ur choice");
		int n=in.nextInt();
		in.close();
		switch(n) {
		case 1:
			sum=a+b;
			System.out.println("sum="+sum);
			break;
		case 2:
			diff=a-b;
			System.out.println("difference="+diff);
			break;
		case 3:
			multiply=a*b;
			System.out.println("multiplication="+multiply);
			break;
			
		case 4:
			division=a/b;
			System.out.println("division="+division);
			break;
			
		default:
				System.out.println("you have entered wrong choice");
		}
		}
		
		

	}


