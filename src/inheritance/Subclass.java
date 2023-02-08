package inheritance;

public class Subclass extends Baseclass{

	 int a=35;
	
	 public void printa() {
		 System.out.println(a);
		 System.out.println(super.a);
	 }
	 public void display() {
		 super.display();
		 System.out.println("volkswagen");		 
	}
	
	public static void main(String[] args) {
		Subclass s=new Subclass();
		s.myownmethod();
	}
	
}
