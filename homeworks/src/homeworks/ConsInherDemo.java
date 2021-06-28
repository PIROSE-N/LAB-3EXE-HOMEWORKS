package homeworks;

public class ConsInherDemo {
	public static void main(String[] args) {
		Shoe shoe=new LeatherShoe11(100);
		
	}

}
class Shoe{
	int i;
	public Shoe() {
		System.out.println("cons called.....");
		
	}
	public Shoe(int i) {
		System.out.println("parametric constructor of shoe called......");
	}
	public void met() {
		System.out.println("parent shoe class method called.......");
	}
}
class LeatherShoe11 extends Shoe{
	public LeatherShoe11(int i) {
		// TODO Auto-generated constructor stub
	}

	public void LeatherShoe11(final int i) {
		super.i=100;
		super.met();
		System.out.println("cons off leather shoe called......");
	}
}
