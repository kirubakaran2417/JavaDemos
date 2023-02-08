package collectionss;

import java.util.HashMap;

public class Hashmapdemo {

	public static void main(String[] args) {
		HashMap<Integer, String> emp=new HashMap<>();
		emp.put(21,"vidhya");
		emp.put(22, "bharathi");
		emp.put(23, "bharathi");
		emp.put(24, "varitha");
		System.out.println(emp);
		//accessing elemets
		emp.replace(23, "hema");

		System.out.println(emp.get(21));
		System.out.println(emp.keySet());
		System.out.println("keys:");
		for(Integer key:emp.keySet()) {
			System.out.print(key);
			System.out.print(",");
		}
		System.out.println(emp.get(23));
	}
}
