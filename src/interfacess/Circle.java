package interfacess;

public class Circle extends Shape{

	@Override
	public double calculateArea() {
		double radius=5.0;
		double area=3.14*radius*radius;
		return area;
	}
	

}
