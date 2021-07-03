package homeworks;

public class PBRArrayDemo {
	public static final String array = null;

	public static void main(String[] args) {
		int arr[]=new int[5];
		for(int i:arr) {
			System.out.print(i+"\t");
		}


	
	System.out.println();
	AcceptArray obj=new AcceptArray();
	obj.modifyArray(arr);
	System.out.println("After Modification...");
	for(int i:arr) {
	System.out.print(i+"\t");
	}
	System.out.println();
	}

	public char[] instanceVariable;
}
	class AcceptArray{
		public void modifyArray(int a[]) {
	a[2]=300;
	}

}
