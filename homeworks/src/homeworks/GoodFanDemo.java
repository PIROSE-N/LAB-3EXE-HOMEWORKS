package homeworks;

import java.util.Scanner;

public class GoodFanDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//BadFan shaitan = new BadFan();
		GoodFan khaitan = new GoodFan();
		while(true) {
			System.out.println("Press a key and then Enter for pulling chain...");
			scan.next();
			khaitan.pull();
		}
	}

}
class GoodFan{
	State state = new SwitchOffState();
	public void pull() {
		state.pull(this);
		
	}
}
abstract class State{
	public abstract void pull(GoodFan fan);
	
}
class SwitchOffState extends State{
	public void pull(GoodFan fan) {
		System.out.println("Switch on State..");
		fan.state=new SwitchOnState();
		
	}
}
class SwitchOnState extends State{
	public void pull(GoodFan fan) {
		System.out.println("meadium speed...");
		fan.state=new MediumSpeedState();
	}
}
class MediumSpeedState extends State{
	public void pull(GoodFan fan) {
		System.out.println("high speed state.....");
		fan.state=new HightSpeedState();
		
	}
}
class HightSpeedState extends State{
	public void pull(GoodFan fan) {
		System.out.println("switch off State...");
		fan.state=new SwitchOffState();
		
}
}
class Badfan{
	int state;
	public void pull() {
		if(state==0) {
			System.out.println("Switch on state...");
			state=1;
			
		}
		else if(state==1) {
			System.out.println("Medium speed state...");
			state=2;
		}
		else if(state==2) {
			System.out.println("hight speed state...");
			state=3;
		}
		else if(state==3) {
			System.out.println("Switch off state....");
			state=0;
		}
	}
}