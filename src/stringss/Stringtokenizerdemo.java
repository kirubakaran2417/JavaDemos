package stringss;

import java.util.StringTokenizer;

public class Stringtokenizerdemo {

	public static void main(String[] args) {
		
		String str="stringtokenizer demo on java";
		
		StringTokenizer st=new StringTokenizer(str," ");
		
		int numberoftokens=st.countTokens();//to count tokens
		
		System.out.println(numberoftokens);
		
		//hasmoretokens and nextt0ken
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
			
		
	}
}
