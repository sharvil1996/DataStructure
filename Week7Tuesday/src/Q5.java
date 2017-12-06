import java.util.*;

public class Q5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Total Elements :: ");
		int no = scanner.nextInt();
		Stack stack = new Stack(no);
		for (int i = 0; i < no; i++) {
			System.out.println("Enter " + (i + 1) + " Elements ");
			stack.pushInteger(scanner.nextInt());
		}
		Q5 q5 = new Q5();
		q5.sortStack(stack);
		int arr[] = stack.getElements();
		System.out.println();
		for (int i = 0; i <= stack.getTop(); i++)
			System.out.print(arr[i] + " ");
	}

	void sortStack(Stack stack) {
		if (!stack.isStackEmpty()) {
			int temp = stack.popInteger();
			sortStack(stack);
			addToStack(stack, temp);
		}
	}

	private static void addToStack(Stack stack, int temp) {
		if (stack.isStackEmpty() || temp > stack.peek())
			stack.pushInteger(temp);
		else {
			int data = stack.popInteger();
			addToStack(stack, temp);
			stack.pushInteger(data);
		}
	}
}
