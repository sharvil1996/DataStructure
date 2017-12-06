public class QueueUsingStack {
	private static int MAX_SIZE;
	public static int stack[];
	private static Stack stack1;
	private static Stack stack2;
	private static int cnt = 0;

	public QueueUsingStack(int MAX_SIZE) {
		this.setMAX_SIZE(MAX_SIZE);
		stack1 = new Stack(getMAX_SIZE());
		stack2 = new Stack(getMAX_SIZE());
	}

	public boolean enQueue(int data) {
		if (!stack1.isStackFull()) {
			stack1.pushInteger(data);
			cnt++;
			return true;
		} else {
			return false;
		}
	}

	public boolean deQueue() {
		for (int i = 0; i <= stack1.getTop(); i++) {
			if (!stack1.isStackEmpty())
				stack2.pushInteger(stack1.popInteger());
			else
				return false;
		}
		stack2.popInteger();
		for (int i = 0; i <= stack2.getTop(); i++) {
			if (!stack2.isStackEmpty()) {
				stack1.pushInteger(stack2.popInteger());

			} else
				return false;
		}
		return true;
	}

	public int[] display() {
		return stack1.getElements();
		/*
		 * int arr[] = stack1.getElements(); System.out.println(stack1.getTop()
		 * + "L"); for (int i = 0; i <= stack1.getTop(); i++) {
		 * System.out.println(arr[i]); }
		 */ }

	public int getMAX_SIZE() {
		return MAX_SIZE;
	}

	public void setMAX_SIZE(int MAX_SIZE) {
		QueueUsingStack.MAX_SIZE = MAX_SIZE;
	}

	public int getTopStack1() {
		return stack1.getTop();
	}
}