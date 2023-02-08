package exceptionhandling;

public class exhandling {

	public static void main(String[] args) {
	/*
		int a=23;
		int b=0;
		System.out.println("line number 1");
		System.out.println("line number 2");
		System.out.println("line number 3");
		try {
			System.out.println(a/b);//line causing exception

		}catch(Exception e) {
			System.out.println("exception is handled");
		}
		
		System.out.println("line number 4");
		System.out.println("line number 5");
*/
		int[] arr= {2,3,4,5,6};
		
		try {
		System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException a1) {
			System.out.println("array index out of bounds exception handled");
		}finally{
			System.out.println("even the exception handled or not ill execute");
		}
		}
		
		
	
	
	}
	
	

