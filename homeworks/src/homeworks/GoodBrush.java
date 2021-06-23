package homeworks;

public class GoodBrush {
	public static void main(String[] args) {
		GoodPaintBrush brush=new GoodPaintBrush();
		RedPaint rp=new RedPaint();
		BluePaint bp=new BluePaint();
		GreenPaint gp=new GreenPaint();
		
		brush.rp=gp;
		brush.doPaint();
	}

}
class GoodPaintBrush{ 
	Paint rp;
	public void doPaint() {
		System.out.println(rp);
	}
}
class BadPaintBrush{
	public void doPaint(int choice) {
		if(choice==1) {
			System.out.println("red color....");
		}
		else if(choice==2) {
			System.out.println("blue color....");
			
		}
		else if(choice==3) {
			System.out.println("green color...");
		}
	}
}
abstract class Paint{
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}
class GreenPaint extends Paint{
	
}