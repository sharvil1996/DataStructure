import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String expression = scanner.nextLine();

		System.out.println(new Paranthesis().checkParanthesis(expression));
	}
}
