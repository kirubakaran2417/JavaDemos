package stringss;

public class Stringbufferdemo {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("java");
		
		System.out.println(sb.length());
		
		System.out.println(sb.append(" world"));
		
		System.out.println(sb.charAt(2));
		
		sb.setCharAt(3, 'a');
		
		System.out.println(sb);
		
		sb.insert(4, "tech");
		System.out.println(sb);
		
		sb.delete(5, 8);
		
		sb.deleteCharAt(3);
		
		
	}
}
