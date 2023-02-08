package constructors;

public class Calc {

	Calc(int a,int b){
		int c=a+b;
	}
	Calc(int a,int b,int d){
		int c=a+b+d;
	}
	Calc(){
		
	}
	public static void main(String[] args) {
		Calc c=new Calc(24,43);
	}
}
