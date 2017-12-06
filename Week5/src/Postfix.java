import java.util.Scanner;
class Postfix
{
	public static int isOperator(char op) {
		switch (op) {
		case '(':
		case ')':
			return 1;
		case '^':
			return 2;
		case '*':
		case '/':
			return 3;
		case '+':
		case '-':
			return 4;
		
		}
		return -1;
	}
	public static void main(String ... args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Valid Expression: ");
		String exp=scan.nextLine();
		Stack opr=new Stack(exp.length());
		String post="";

		for(int i=0;i<exp.length();i++)
			if(isOperator(exp.charAt(i))!=-1)
			{
				if(exp.charAt(i)==')')
				{
					while(!opr.isAvailable())
						if(opr.peek()=='(')
						{
							opr.pop1();
							break;
						}
						else
						{
							post+=(char)opr.peek();
							opr.pop1();
						}
					continue;
				}
				while(!opr.isAvailable())
				{
					if(isOperator((char) opr.peek())>=isOperator(exp.charAt(i)) && opr.peek()!='(')
					{
						post+=(char)opr.peek();
						opr.pop1();
					}
					else
						break;
				}
				opr.push(exp.charAt(i));
			}
			else
				post+=exp.charAt(i);
		
		int[] temp=opr.getElements();
		for(int i=temp.length-1;i>=0;i--)
			post+=(char)temp[i];
		System.out.println(post);
	}
}