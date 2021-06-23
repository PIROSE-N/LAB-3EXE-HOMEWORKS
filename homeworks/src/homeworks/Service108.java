package homeworks;

public class Service108<helper> {
	void help(Police p) {
		System.out.println("The caller is a police man...let connetct with control room");
		}
	void help(AccidentVictim a) {
		System.out.println("The caller is accident victim...let connect with doctor... ");
	}
	void help(helper h) {
		System.out.println("The calller is a helper....let us help him");
		
	}
	
public static void main(String[] args) {
	Service108 obj108=new Service108();
	Police captain=new Police();
	AccidentVictim ac=new AccidentVictim();
	Police ram=new Police();
	obj108.help(ram);
}
}
class Police{
	
}
class AccidentVictim{
	
}
class Helper{

}