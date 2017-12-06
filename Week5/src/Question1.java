import java.util.*;

public class Question1 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Stack stack = new Stack();

		while (true) {
			System.out.println();
			System.out.println("1 - PUSH");
			System.out.println("2 - POP");
			System.out.println("3 - Check stack is Full");
			System.out.println("4 - Check stack is Empty");
			System.out.println("5 - Peek");
			System.out.println("6 - Display");
			System.out.println("7 - Exit");

			System.out.println();

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter a number :: ");
				int num = scanner.nextInt();
				System.out.println(stack.push(num));
				break;
			case 2:
				System.out.println(stack.pop());
				break;
			case 3:
				System.out.println(stack.isStackFull() ? "True" : "False");
				break;
			case 4:
				System.out.println(stack.isStackEmpty() ? "True" : "False");
				break;
			case 5:
				if (stack.isStackEmpty()) {
					System.out.println("Stack is Empty...!");
					break;
				} else {
					System.out.println(stack.peek());
				}
				break;
			case 6:
				if (stack.isStackEmpty()) {
					System.out.println("Stack is Empty...!");
					break;
				} else {
					int arr[] = stack.getElements();
					//System.out.println(arr.length);
					for (int i = 0; i < arr.length; i++)
						System.out.print(arr[i] + " ");
					break;
				}
			case 7:
				System.out.println("GOOD BYE...!");
				System.exit(0);
				break;

			}
		}
	}
}