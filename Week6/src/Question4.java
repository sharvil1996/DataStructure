import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		FindValueClass findValueClass = new FindValueClass();
		Scanner scanner = new Scanner(System.in);
		String expression = scanner.nextLine();
		System.out.println(findValueClass.computeExpression(expression));

	}

}
