import java.util.Scanner;

interface CheckPalindrom {
	public boolean isPalindromString(Stack stack);
}

public class Question2 implements CheckPalindrom {

	public static void main(String[] args) {
		CheckPalindrom checkPalindrom = new Question2();
		Scanner scanner = new Scanner(System.in);
		String expression = scanner.next();
		Stack stack = new Stack();
		for (int i = 0; i < expression.length(); i++)
			stack.pushInteger(expression.charAt(i));
		System.out.println(checkPalindrom.isPalindromString(stack));
	}

	@Override
	public boolean isPalindromString(Stack stack) {
		Stack reverse = new Stack();
		int ch[] = stack.getElements();
		for (int i = stack.getTop(); i >= 0; i--)
			reverse.pushInteger(ch[i]);
		int arr[] = reverse.getElements();
		for (int i = 0; i <= reverse.getTop(); i++)
			if (arr[i] != ch[i])
				return false;
		return true;
	}
}
