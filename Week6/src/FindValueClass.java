
class FindValueClass {

	public int computeExpression(String expression)
	{
		Stack stack = new Stack();
		String arr[] = expression.split(" ");
		for (int i = 0; i < arr.length; i++) {
			char c[] = arr[i].toCharArray();
			if ( new ConvertInfix().isOperator(c[0]) == -1) {
				stack.pushInteger(Integer.parseInt(arr[i] + ""));
			} else {
				if (stack.getTop() == 0) {
					System.out.println("Expression is not valid...!");
					System.exit(0);
				}

				int operator = c[0];
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
				case '^':
					stack.pushInteger((int)Math.pow(op2,op1));
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
