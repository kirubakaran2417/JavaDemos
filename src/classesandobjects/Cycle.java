package classesandobjects;

public class Cycle {

	//bicycle-state(idle,height,model,name) and behaviour(braking,speed)

	//state-variables;
	String name;

	public static void main(String[] args) {
		
		//classname objectname =new classname();
		Cycle SportsCycle=new Cycle();
		SportsCycle.name="Trek";
		System.out.println(SportsCycle.name);

		//classname objectname =new classname();
		Cycle HybridCycle=new Cycle();
		HybridCycle.name="Giant";
		System.out.println(HybridCycle.name);
	}


}
