package constructors;

public class Constructordemo {

	String name;
	int age;
	String address;
	//here we are not using any contructors so java compiler will automatically insert a default constructor
	public Constructordemo() {
		name="Tony";
		age=25;
		address="chennai";
	}
	void display() {
		System.out.println(name+" "+age+" "+address);
	}
	
	public static void main(String[] args) {
		Constructordemo cd=new Constructordemo();
		cd.display();
	}
}
