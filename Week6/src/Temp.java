
public class Temp {

	static int a = 5;

	public static void main(String[] args) {
		m1();	
		System.out.println("HI-Main" + ++a);
	}
	
	static {
		m1();
		System.out.println("HI" + ++a);
	}
	static int j = 10;
	static{
		m1();
		System.out.println("Second");
	}
	private static void m1() {
		System.out.println("Hello m1        " + j);
		
	}
	
}
