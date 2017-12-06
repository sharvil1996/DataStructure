import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ComplexNumber c1;
		ComplexNumber c2;
		int choice = 0;
		do {

			System.out.println("---------------------------");
			System.out.println("1 - Addtion");
			System.out.println("2 - Substration");
			System.out.println("3 - Multiplication");
			System.out.println("4 - Division");
			System.out.println("5 - Exit");
			System.out.println("---------------------------");
			System.out.println("Enter Choice :: ");
			choice = sc.nextInt();

			System.out.println("Enter first Imaginary Number :: ");
			int imaginary1 = sc.nextInt();
			
			System.out.println("Enter first Real Number :: ");
			int real1 = sc.nextInt();

			System.out.println("Enter Second Imaginary Number :: ");
			int imaginary2 = sc.nextInt();
			
			System.out.println("Enter Second Real Number :: ");
			int real2 = sc.nextInt();

			switch (choice) {
			case 1:
				c1 = new ComplexNumber(imaginary1,real1);
				c2 = new ComplexNumber(imaginary2,real2);
				System.out.println(c1.add(c2));
				break;
			case 2:
				c1 = new ComplexNumber(imaginary1,real1);
				c2 = new ComplexNumber(imaginary2,real2);
				System.out.println(c1.sub(c2));
				break;
			case 3:
				c1 = new ComplexNumber(imaginary1,real1);
				c2 = new ComplexNumber(imaginary2,real2);
				System.out.println(c1.mult(c2));
				break;
			case 4:
				c1 = new ComplexNumber(imaginary1,real1);
				c2 = new ComplexNumber(imaginary2,real2);
				System.out.println(c1.div(c2));
				break;
			default:
				break;
			}

		} while (choice != 5);
	}
}
