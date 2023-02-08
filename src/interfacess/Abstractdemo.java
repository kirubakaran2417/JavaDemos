package interfacess;

public class Abstractdemo {

	public static void main(String[] args) {
		Square s=new Square();
		System.out.println(s.calculateArea());
		s.setcolor("Red");
		Circle c=new Circle();
		System.out.println(c.calculateArea());
		c.setcolor("Blue");
	}
}
