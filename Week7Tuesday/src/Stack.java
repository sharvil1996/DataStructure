public class Stack {
	private int MAX_SIZE;
	public int stack[];
	private int top = -1;

	public Stack() {
		top = -1;
		this.MAX_SIZE = 5;
		stack = new int[MAX_SIZE];
	}

	public Stack(int MAX_SIZE) {
		top = -1;
		this.MAX_SIZE = MAX_SIZE;
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
		try {
			return stack[top--];
		} catch (Exception e) {
		}
		return 0;
	}

	public char pop1() {
		return (char) stack[top--];
	}

	public int get(int temp) {
		return stack[temp];
	}

	public boolean isAvailable() {
		return top != 0;
	}

	public int push(int no) {
		stack[++top] = no;
		return no;
	}
	public String findMaxMin(int max,int min,int i){
	    if(i >= 0){
	      int no1 = get(i);
				if(min > no1)
					min = no1;
				if(max < no1)
					max = no1;
				return findMaxMin(max,min,--i);
	    }
			else
	    	return "Maximum is " + max + " minimum is "+ min;
	  }
}
