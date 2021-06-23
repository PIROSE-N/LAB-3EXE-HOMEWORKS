package homeworks;

public class MethodOverloadDemo3 {
	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println("value of x : " +s.disp(5));
		System.out.println("value of y : " +s.disp(6.5));
		
		
	}

}
class Sample{
	int displ(int x) {
		return x;
	}
	double disp(double y) {
		return y;
	}
}