package homeworks;

public class MethodOverloadDemo2 {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.multiply(2,50);
		obj.multiply(10,20,30);
		
	}
}
class Demo
{
	void multiply(int a,int b)
	{
		System.out.println("Result is: " +(a*b));
	}
	void multiply(int a,int b,int c)
	{
		System.out.println("Result is: " +(a*b*c));
	}
}