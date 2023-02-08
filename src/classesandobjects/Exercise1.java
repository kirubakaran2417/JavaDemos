package classesandobjects;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter seconds: ");
		int sec=s.nextInt();
		int a =sec%60;
		int b=sec/60;
		int c=b%60;
	}
}
