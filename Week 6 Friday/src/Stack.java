public class Stack {

	private static int MAX_SIZE;
	public static int stack[];
	private static int top = -1;

	public Stack(int MAX_SIZE) {
		top = -1;
		Stack.MAX_SIZE = MAX_SIZE;
		stack = new int[MAX_SIZE];
	}

	public boolean isStackFull() {
		if (top == MAX_SIZE - 1)
			return true;
		else
			return false;
	}

	public boolean isStackEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public int[] getElements() {
		return stack;
	}

	public int peek() {
		return stack[top];
	}

	public int getTop() {
		return top;
	}

	public boolean pushInteger(int element) {
		if (isStackFull())
			return false;
		else {
			stack[++top] = element;
			return true;
		}

	}

	public int popInteger() {
		return stack[top--];
	}
}