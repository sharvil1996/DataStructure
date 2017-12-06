import java.util.*;

public class Question2 {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		String experssion = scanner.next();
		PostFixConverstion postFixConverstion = new PostFixConverstion();

		System.out.println(postFixConverstion.convertPostfix(experssion));
	}

}