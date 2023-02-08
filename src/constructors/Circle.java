package constructors;

public class Circle {

	double radius;
	double area;
	
	public Circle(double x) {
		radius=x;
		area=3.14*radius*radius;
		
	}
	
	void display() {
		System.out.println(radius);
		System.out.println(area);
	}
	
	public Circle() {
		radius=1;
	}
	
	double getarea() {
		area=3.14*radius*radius;
		return area;
	}
	public static void main(String[] args) {
		Circle c1=new Circle(2.0);
		Circle c2=new Circle(12);
		Circle c3=new Circle(24);

		c1.display();
		c2.display();
		c3.display();
		
		Circle c4=new Circle();
		System.out.println(c4.getarea());
	}
}
