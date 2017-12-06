import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String expression = new String();

		expression = scanner.next();

		if (CheckBalance.checkBalance(expression) == 1)
			System.out.println("True");
		else
			System.out.println("False");
	}

	
}