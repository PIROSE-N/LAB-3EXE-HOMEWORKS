package homeworks;

public class AbstractDemo {
	public static void main(String[] args) {
		new Child();
		
	}

}
abstract class GrandParent{
	public abstract void met();
	
}
abstract class Parent extends GrandParent{
	final int i=10;
	public Parent() {
		System.out.println("abstract class Parent cons called");
	}
	public abstract void yoursSayHello();
	final public void mySayHellow() {
		System.out.println("saying hellow as per the abstract class norms...");
		
	}
}
class Child extends Parent{
	public void met() {
	}
	public Child() {
		System.out.println("child class of abstract parent object created.......");
	}
public void yoursSayHellow() {
	System.out.println("say Hellow as per the child class logic....or norms");
}

public void mySayHello() {
	System.out.println("write my own logic....");
	
	
}
@Override
public void yoursSayHello() {
	// TODO Auto-generated method stub
	
}
}
