class CheckBalance {

	public static int checkBalance(String expression) {

		int top = -1;
		Stack stack = new Stack();
		for (int i = 0; i < expression.length(); i++) {
			switch (expression.charAt(i)) {
			case '{':
				top++;
				stack.push('{');
				break;
			case '[':
				top++;
				stack.push('[');
				break;
			case '(':
				top++;
				stack.push('(');
				break;
			case '}':
				if (stack.pop1() == '{')
					top--;
				break;
			case ']':
				if (stack.pop1() == '[')
					top--;
				break;
			case ')':
				if (stack.pop1() == '(')
					top--;
				break;
			}
		}

		if (top == -1)
			return 1;
		return 0;
	}

}
