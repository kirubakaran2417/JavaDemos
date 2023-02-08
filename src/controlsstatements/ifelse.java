package controlsstatements;

public class ifelse {
	

	public static void main(String[] args) {
		
		//decision making statements
		//if,if else,else if ,switch
		
		int a=10;
		int b=20;
		//if and if else
		if(a>b) {
			System.out.println("a is greater");
		}else {
			System.out.println("b is greater");
		}
		//========================================================================
		//nested if
		if(a==10 && a>b) {
			
				System.out.println("nested if");
			
		}
		//=============================================================================
		//else if
		if (a==50) {
			System.out.println("im equal to 50");
		}else if(a==40){
			System.out.println("im equal to 50");
		}else if(a==30){
			System.out.println("im equal to 50");
		}else if(a==20){
			System.out.println("im equal to 50");
		}else {
			System.out.println("im equal to 10");
		}

	}
}
