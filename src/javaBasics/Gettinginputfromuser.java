package javaBasics;

import java.util.Scanner;//importing scanner class from java.util package

public class Gettinginputfromuser {
public static void main(String[] args) {
	//scanner is the class which is used to access the user inputs from console
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value of a");
	int a=s.nextInt();
	System.out.println("enter the value of b");
	int b=s.nextInt();
	String name=s.next();
	double val=s.nextDouble();
	System.out.println(a+b);
	System.out.println(name);
	System.out.println(val);
	
	
}
}
