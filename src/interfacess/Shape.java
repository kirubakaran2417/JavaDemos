package interfacess;

public abstract class Shape {

	String color;
	
	public abstract double calculateArea();
	//public abstract double calculatePerimeter();
	public void setcolor(String color) {
		this.color=color;
		System.out.println("The color of shape: "+color);
	}
}
