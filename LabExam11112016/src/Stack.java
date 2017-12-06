
public class Stack {

	private int MAX_SIZE;
	private int stack[];
	private int top = -1;
	private int Min;


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
			if (element > Min)
				Min = element;
			stack[++top] = element;

			stack = this.sort(stack, top + 1);

			return element + " Added Successfully...!";
		}
	}

	public String pop() {
		if (isStackEmpty())
			return "Stack is Empty..!!";
		else {
			int element = stack[top--];
			stack = this.sort(stack, top + 1);
			return element + " Removed Successfully...!";
		}
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

	public int findMin() {
		return stack[0];
	}

	public int[] sort(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}