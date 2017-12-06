import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String expression = scanner.next();
		Calculation calculation = new Calculation();
		String temp = calculation.createStack(expression);
		temp = calculation.convertPostfix(temp);
		System.out.println(calculation.computeExpression(temp));
	}

}
