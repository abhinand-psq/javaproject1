package project4;

import java.util.Scanner;

public class Strings {

public  static void main(String ar[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter name");
	String name=s.next(); 
	System.out.println("your name "+name+" saved");
	System.out.println("enter your password");
	String p=s.next();
	System.out.println("your password "+p+" stored");
	System.out.println("enter username");
	String a=s.next();
System.out.println("enter password");
	
	String b=s.next();
	if(a.equals(name)&b.equals(p)){
		System.out.println("you can enter");
		System.out.println("enter two numbers and opearnd");
		double sum;
		double div;
		double num1=s.nextFloat();
	  char op=s.next().charAt(0);
		double num2=s.nextFloat();
		
		if(op=='+') {
		sum=num1+num2;	
		System.out.println(sum);
		}
		else if(op=='-') {
		     if(num1>num2) {
			 sum=num1-num2;
			 System.out.println(sum);
		 }else {
			 sum=num2-num1;
			 System.out.println(sum);
		 }
		}
		else if(op=='*') {
			sum=num1*num2;
			System.out.println(sum);
		}
		else if(op=='/') {
			if(num1!=0 & num2!=0) {
				div=(num1/num2);
				System.out.println(div);
			}else {
				System.out.println("invalid");
			}
			
		}
		
	}else {
		System.out.println("sorry");
		return;
	}
	
	
}

}
