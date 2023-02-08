package classesandobjects;

public class Methodss {
//methods with parameters
	//3 types of variables
	int a=50;//global
	public void add(int b) {
		int c;//local
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		Methodss m=new Methodss();
		m.add( 39);
	}
}
