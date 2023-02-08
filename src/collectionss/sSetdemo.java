package collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sSetdemo {

	public static void main(String[] args) {
		
		Set<Integer> s1=new HashSet<>();//unordered collection
		s1.add(21);
		s1.add(34);
		s1.add(43);
		s1.add(56);
		s1.add(43);
		System.out.println(s1);
		//coversion of set to list
		List<Integer> a1=new ArrayList<>(s1);;
	}
}
