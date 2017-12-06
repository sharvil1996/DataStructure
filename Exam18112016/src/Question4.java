import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a,r,b,h,l;
		for (int i = 0; i < n; i++) {
			a = scanner.nextInt();
			switch(a){
			case 1:
				int c = scanner.nextInt();
				System.out.println(c*c*c*c);
				break;
			case 2:
				l = scanner.nextInt();
				b = scanner.nextInt();
				h = scanner.nextInt();
				System.out.println(l*b*h);
				break;
			case 3:
				
				break;
			case 4:
				break;
			}
		}
	}
}
