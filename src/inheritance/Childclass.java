package inheritance;

public class Childclass extends Parentclass{

	public  void add(){
		
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		//create object of childclass
		Childclass c=new Childclass();
		c.display();
	}
}
