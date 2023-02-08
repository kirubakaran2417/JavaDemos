package inheritance;

public class Childclass2 extends Childclass{

	public  void add(){
		
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		//create object of childclass
		Childclass2 c=new Childclass2();
		c.display();
	}
}
