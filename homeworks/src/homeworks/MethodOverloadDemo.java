package homeworks;

public class MethodOverloadDemo {
	public static void main(String[] args) {
		Calculate obj=new Calculate();
		obj.multiply();
		obj.multiply(5);
		obj.multiply(2.5f);
	}

}
class Calculate
{
	public void multiply()
	{
		System.out.println("No Parameter Called");
		
	}
public int multiply(int number)
{
	int result = number * number;
	System.out.println("Method with Integer Argument Called: " +result);
	return result;
	
}
public float multiply(float number)
{
	float result = number * number;
	System.out.println("Method with float Argument called " +result);
	return result;
}
}

