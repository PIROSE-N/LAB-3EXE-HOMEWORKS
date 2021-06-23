package homeworks;

public class InherDemo {
	public static void main(String[] args) {
		Employee p=new Employee();
		Engineer eng=new Engineer();
		
		p.met(2);
		eng.met(2);
		
	}

}
class Human{
	public void rose() {
		System.out.println("rose method called......");
	}
	
}
class Employee extends Human{
	public int met(int i) {
		System.out.println("met method of employee called....");
		return i;
	}
}
class Engineer extends Employee{
	public int met(int i) {
		System.out.println("engineer met method called...");
		super.met(4); //super is keyword which refers parent class....
		super.rose();
		return i;
	}
}
class Attender extends Employee{
	
}