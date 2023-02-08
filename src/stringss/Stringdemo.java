package stringss;

public class Stringdemo {

	public static void main(String[] args) {
		
		String s1=new String("java");
		String s2=new String("java");
		String s3="java";
		String s4="java";
		String s5="JAVA";
		
		String s6="ranchi";
		String s7="pune";
		
		/*
		 * String comparison
		 * 
		 * BY equals
		 * by == operator
		 * by compareto method
		 * 
		 */
		
		System.out.println(s3.equals(s4));//this will compare content and case
		System.out.println(s1.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s5));
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s4);//compare refrence numbers(memory addresses);
		System.out.println(s3.compareTo(s4));
		System.out.println(s6.compareTo(s7));
		System.out.println(s7.compareTo(s6));
		
		//String concatenate
		/*
		 * by concat
		 * by + operator
		 */
		String s8=s7.concat("cognizant");//pune
		System.out.println(s8);
		
		System.out.println(s8+" "+"Tcs");
		
		//substring
		
		String str="Ind ia";
		String sub=str.substring(3);
		System.out.println(sub);
		
		System.out.println(str.isEmpty());//to check that string is empty or not
		System.out.println(str.length());//to return the number of chracters
		System.out.println(str.replace(" ", ""));// to replace old chracter to new character
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(2));
		System.out.println(str.trim());
		System.out.println(str.contains("ia"));
		System.out.println(str.indexOf("i"));
		
		String ss="Sachin tendulkar";
		
		
		
	}
}
