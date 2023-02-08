package Encapsulation;

public class Perimeter {

	//variables of class
	private int length;
	private int breadth;
	//constructor too initialize the values
	Perimeter(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	//method that manipulates the variable
	public void getPerimeter() {
		int perimeter=2*(length*breadth);
		System.out.println("perimater of rectngle: "+perimeter);
	}
}
