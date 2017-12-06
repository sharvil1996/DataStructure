interface A {
	public void m1();
}

abstract class B implements A {
	public void m1() {
		System.out.println("M1");
	}
}
abstract class C{
	public void m1(){
		System.out.println("M1 in C");
	}
}

public class Temp1 extends C {

		public static void main(String[] args) {
			C a =new Temp1();
			a.m1();
			
		}

}
