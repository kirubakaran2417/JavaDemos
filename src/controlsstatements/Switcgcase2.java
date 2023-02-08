package controlsstatements;

import java.util.Scanner;

public class Switcgcase2 {

	public static void main(String[] args) {
		int selection;
		Scanner s=new Scanner(System.in);
		System.out.println("please enter your selection");
		do {
			selection=s.nextInt();
			switch (selection) {
			case 1:
				System.out.println("please enter amount");
				break;
			case 2:
				System.out.println("enter id number");
				break;
			case 3:
				System.out.println("enter amount to be credited");
				break;
			}
			System.out.println("1. Transfer\n 2. check balance\n 3. Recharge");
	}while(selection>4);
}}
