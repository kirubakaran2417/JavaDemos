package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {

	String name;
	int balance;
	int id;
	//constructor
	public Customer(String name, int balance, int id) {
		this.name = name;
		this.balance = balance;
		this.id = id;
	}
	//toString method which is used to give meaningful string representation of each object
	@Override
	public String toString() {
		return "Customer [name=" + name + ", balance=" + balance + ", id=" + id + "]";
	}
	
	public static void main(String[] args) {
		
		List<Customer> a1=new ArrayList<>();
		
		Customer c1=new Customer("kiruba", 1000, 2);
		Customer c2=new Customer("karthi", 2000, 3);
		Customer c3=new Customer("vidhya", 3000, 4);
		Customer c4=new Customer("affrin", 4000, 5);
		
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		a1.add(c4);
		
		for (Customer customer : a1) {
			System.out.println(customer);
		}	}
	
}
