package homeworks;
//Constructor Overloading
public class ConstructorDemo {
	public ConstructorDemo() {
		System.out.println("con called.....");
		
	}
	public  ConstructorDemo(int i) {
		System.out.println("overload cns called");
	}
	public  ConstructorDemo (String s){
		System.out.println("String Cons Called....");
	}
	public  ConstructorDemo(int s,String str) {
		System.out.println("Multi Parameter Constructor....");
		
	}
	public static void main(String[] args) {
		ConstructorDemo obj1=new ConstructorDemo(100,"hello");
		ConstructorDemo obj2=new ConstructorDemo();
		
		obj2.met();
		obj2.met(1);
		
		//the name of the Concept is Virtual Method Invocation (VMI)
		//oNLY ONE constructor can be called whwn one object is Created
	}
	void met() {
		System.out.println("Method without parameter Called....");
	}
	void met(int i) {
		System.out.println("Method with parameter called....");
	}
}
