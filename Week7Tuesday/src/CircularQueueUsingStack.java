public class CircularQueueUsingStack {
	private static int MAX_SIZE;
	public static int stack[];
	private Stack stack1;
	private Stack stack2;
	public CircularQueueUsingStack(int MAX_SIZE) {
		this.setMAX_SIZE(MAX_SIZE);
		stack1 = new Stack(getMAX_SIZE());
		stack2 = new Stack(getMAX_SIZE());
	}
	public boolean enQueue(int data) {
		if (!stack1.isStackFull()) {
			stack1.pushInteger(data);
			return true;
		}
		else
			return false;
	}
	public boolean deQueue() throws Exception {

		if(stack1.isStackEmpty())
			return false;
		int temp = stack1.getTop();
		for (;;) {
			if (!stack1.isStackEmpty())
			{
				stack2.pushInteger(stack1.popInteger());
			}
			else
				break;
		}
		stack2.popInteger();
		for (;;) {
			if (!stack2.isStackEmpty()) {
				stack1.pushInteger(stack2.popInteger());
			}
			else
				break;
		}
		return true;
	}
	public int[] display() {
		return stack1.getElements();
	}
	public int getMAX_SIZE() {
		return MAX_SIZE;
	}
	public void setMAX_SIZE(int MAX_SIZE) {
		this.MAX_SIZE = MAX_SIZE;
	}
	public int getTopStack1(){
		return stack1.getTop();
	}
}
