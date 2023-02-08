package collectionss;

import java.util.ArrayList;
import java.util.List;

public class listdemo {
	
	public static void main(String[] args) {
		
		//creation of arraylist
		
		List<Integer> a1=new ArrayList<>();//ordered collection,accepts duplicates
		
		//adding the elements
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		System.out.println(a1);
		
		System.out.println(a1.size());
		a1.add(1,55);
		System.out.println(a1);

	}

}
