package constructors;

public class Student {

	//instance variables of class
	String name;
	int id;
	
	//constructors would initialize data members
	//with the values of passed arguments
	
	Student(String n,int i){
		name=n;
		id=i;
	}
	
	void display() {
		System.out.println(name+" "+id);
	}
	
	public static void main(String[] args) {
		
		Student s=new Student("kiruba",1);
		s.display();
	}
}
