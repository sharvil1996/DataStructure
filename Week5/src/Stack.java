public class Stack {
	private int MAX_SIZE;
	private int stack[];
	private int top = -1;

	public Stack() {
		MAX_SIZE = 5;
		stack = new int[MAX_SIZE];
	}

	public Stack(int size) {
		MAX_SIZE = size;
		stack = new int[MAX_SIZE];
	}
	public String push(int element) {
		if (isStackFull())
			return "Stack is Full..!!";
		else {
			stack[++top] = element;
			return element + " Added Successfully...!";
		}
	}

	public String pop() {
		if (isStackEmpty())
			return "Stack is Empty..!!";
		else {
			int element = stack[top--];
			return element + " Removed Successfully...!";
		}
	}

	public char pop1() {
			return (char) stack[top--];
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
		int arr[] = new int[top + 1];
		for (int i = 0; i < top + 1; i++)
			arr[i] = stack[i];
		return arr;
	}

	public int peek() {
		return stack[top];
	}

	public boolean isAvailable() {
		return top!=0;
	}
	
}