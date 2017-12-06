
class Paranthesis {

	public int checkParanthesis(String expression) {

		Stack stack = new Stack();
		int output = 0;
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '(') {
				stack.push(expression.charAt(i));
			} else {
				if (expression.charAt(i) == ')') {
					if (stack.getTop() >= 0) {
						if (stack.pop1() == '(')
							output += 2;
					}
				}
			}
		}
		return output;
	}

}
