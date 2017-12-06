import java.util.*;

public class Question3
{

	
	public static void main(String args[])
	{

		Scanner scanner = new Scanner(System.in);
		String experssion = scanner.next();

		ConvertInfix convertInfix = new ConvertInfix();
		
		experssion = convertInfix.genrateReverse(experssion);
				
		experssion = convertInfix.replaceBracket(experssion);
		System.out.println(experssion);
		System.out.println(convertInfix.infix(experssion));		
	}
	
}