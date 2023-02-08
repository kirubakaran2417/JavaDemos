package stringss;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("please enter even digit string");
		String str=s.nextLine();
		System.out.println(Usermaincode.getMiddlechars(str));
		
	}
}
