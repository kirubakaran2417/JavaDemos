package stringss;

public class Usermaincode {

	public static String getMiddlechars(String str) {
		
		StringBuffer s=new StringBuffer();
		if(str.length()%2==0) {
			s.append(str.substring((str.length()/2)-1,(str.length()/2)+1));
		}
		
		return s.toString();
		
	}
}
