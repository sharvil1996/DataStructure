
class Calculation {

	public static int isOperator(char op) {
		switch (op) {
		case '(':
		case ')':
			return 1;
		case '*':
		case '/':
			return 2;
		case '+':
		case '-':
			return 3;
		}
		return -1;
	}

	public String convertPostfix(String experssion) {
		char op[] = new char[experssion.length()];
		String ans = "";
		int top = 0;
		for (int i = 0; i < experssion.length(); i++) {
			if (isOperator(experssion.charAt(i)) != -1) {
				if (experssion.charAt(i) == ')') {
					while (true) {
						if (op[--top] != '(') {
							if (op[top] != ')' && op[top] != '(')
								ans += op[top];
							op[top] = ' ';
						} else {
							op[top] = ' ';
							break;
						}
					}
					continue;
				}
				for (int j = top - 1; j >= 0; j--) {
					if (isOperator(op[j]) <= isOperator(experssion.charAt(i)) && op[j] != '(') {
						if (op[--top] != '(' && op[top] != ')')
							ans += op[top];
						op[top] = ' ';
					} else
						break;
				}
				if (experssion.charAt(i) != ')')
					op[top++] = experssion.charAt(i);

			} else
				ans += experssion.charAt(i);

		}
		for (int i = top - 1; i >= 0; i--)
			ans += op[i] + "";
		return ans;

	}
	public String createStack(String expression) {

		Stack stack = new Stack(expression.length()*2);

		char[] arr = new char[100];
		int top = -1;
		for (int i = 0; i < expression.length(); i++) {
			if (i == 0) {
				stack.push(expression.charAt(i));
				arr[++top] = expression.charAt(i);
			} else {
				char c = (char) stack.peek();
				if (Character.isAlphabetic(c) && Character.isAlphabetic(expression.charAt(i))) {
					stack.push('+');
					stack.push(expression.charAt(i));
					arr[++top] = '+';
					arr[++top] = expression.charAt(i);
				} else if (Character.isAlphabetic(c) && expression.charAt(i) == ')') {
					stack.push(')');
					arr[++top] = ')';
				} else if (c == '(' && Character.isAlphabetic(expression.charAt(i))) {
					stack.push(expression.charAt(i));
					arr[++top] = expression.charAt(i);
				} else if (c == ')' && Character.isDigit(expression.charAt(i))) {
					stack.push('*');
					stack.push(expression.charAt(i));
					arr[++top] = '*';
					arr[++top] = expression.charAt(i);
				} else if (c == ')' && Character.isAlphabetic(expression.charAt(i))) {
					stack.push('+');
					stack.push(expression.charAt(i));
					arr[++top] = '+';
					arr[++top] = expression.charAt(i);
				} else if (Character.isAlphabetic(c) && Character.isDigit(expression.charAt(i))) {
					stack.push('*');
					stack.push(expression.charAt(i));
					arr[++top] = '*';
					arr[++top] = expression.charAt(i);
				} else if (Character.isAlphabetic(expression.charAt(i)) && Character.isDigit(c)) {
					stack.push('+');
					stack.push(expression.charAt(i));
					arr[++top] = '+';
					arr[++top] = expression.charAt(i);
				} else if (expression.charAt(i) == '(' && Character.isDigit(c)) {
					stack.push('+');
					stack.push(expression.charAt(i));
					arr[++top] = '+';
					arr[++top] = expression.charAt(i);
				} else if (Character.isAlphabetic(c) && expression.charAt(i) == '(') {
					stack.push('+');
					stack.push(expression.charAt(i));
					arr[++top] = '+';
					arr[++top] = expression.charAt(i);
				} else if (c == ')' && expression.charAt(i) == '(') {
					stack.push('+');
					stack.push(expression.charAt(i));
					arr[++top] = '+';
					arr[++top] = expression.charAt(i);
				} else if (expression.charAt(i) == '(') {
					stack.push('(');
					arr[++top] = '(';
				} else if (expression.charAt(i) == ')') {
					stack.push(')');
					arr[++top] = ')';
				}
			}
		}
		char[] a = new char[top + 1];
		for (int j = 0; j <= top; j++) {
			a[j] = arr[j];
		}
		return new String(a);
	}

	public int computeExpression(String expression) {
		Stack stack = new Stack();
		for (int i = 0; i < expression.length(); i++) {
			if (Character.isAlphabetic(expression.charAt(i))) {
				if (expression.charAt(i) == 'C')
					stack.pushInteger(12);
				else if (expression.charAt(i) == 'H')
					stack.pushInteger(1);
				else if (expression.charAt(i) == 'O')
					stack.pushInteger(16);
			} else {
				int operator = expression.charAt(i);
				int op1 = stack.popInteger();
				int op2 = stack.popInteger();

				switch (operator) {
				case '+':
					stack.pushInteger(op2 + op1);
					break;
				case '-':
					stack.pushInteger(op1 - op2);
					break;
				case '*':
					stack.pushInteger(op2 * op1);
					break;
				case '/':
					stack.pushInteger(op2 / op1);
					break;
				default:
					System.out.println("Invalid Expression...!");
					break;
				}

			}

		}
		return stack.peek();
	}


}
