
class ConvertInfix {

	public String genrateReverse(String expression)
	{
		StringBuffer buffer = new StringBuffer(expression);
		buffer.reverse();
		expression = new String(buffer);
		return expression;
	}

	public int isOperator(char op)
	{
		switch(op)
		{
			case '(':
			case ')':
				return 1;
			case '*':
			case '/':
				return 2;
			case '+':
			case '-':
				return 3;
			case '^':
				return 4;
		}
		return -1;
	}

	
	public String infix(String experssion)
	{
		char op[] = new char[experssion.length()];
		String ans ="";
		int top=0;
		
		for(int i=0;i<experssion.length();i++)
		{
			if(isOperator(experssion.charAt(i)) != -1)
			{
				if(experssion.charAt(i) == ')')
				{
					while(true)
					{
						if(op[--top] != '(')
						{
							if(op[top]!=')' && op[top] != '(')
								ans += op[top];
							op[top] = ' ';
						}
						else
						{
							op[top] = ' ';	
							break;
						}
					}
					continue;
				}
				for(int j=top-1;j>=0;j--)
				{	
					
					if(isOperator(op[j])<=isOperator(experssion.charAt(i)) && op[j]!='(')
					{	
						
						if(op[--top]!='(' && op[top]!=')')
							ans += op[top];
						op[top] = ' ';
					}
					else
						break;
				}
				if(experssion.charAt(i) != ')')
					op[top++]=experssion.charAt(i);

			}
			else
				ans += experssion.charAt(i);

		}
		for(int i=top-1;i>=0;i--)
				ans += op[i]+"";
		
		return genrateReverse(ans);
		
		

	}
	
	public String replaceBracket(String expression)
	{
		String temp="";
		for(int i=0;i<expression.length();i++)
		{
			
			
			if(expression.charAt(i) == '(')
				temp +=')';
			else if(expression.charAt(i) == ')')
				temp+='(';
			else
				temp+=expression.charAt(i);
		}
		return temp;
	}
}
