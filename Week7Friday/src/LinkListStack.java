import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkListStack extends Stack<Integer>{

	public static void main(String[] args) throws IOException, EmptyLinkListException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		LinkListStack linkListStack = new LinkListStack();
		while (true) {
			System.out.println();
			System.out.println("1 - Push");
			System.out.println("2 - Pop");
			System.out.println("3 - Peek");
			System.out.println("4 - Display");
			System.out.println("5 - Exit");
			System.out.println();
			System.out.println("Enter a choice :: ");
			int choice = Integer.valueOf(bufferedReader.readLine());

			switch (choice) {
			case 1:
				int data = Integer.valueOf(bufferedReader.readLine());
				linkListStack.push(data);
				break;
			case 2:
				linkListStack.pop();
				break;
			case 3:
				System.out.println(linkListStack.peek());
				break;
			case 4:
				linkListStack.displayStack();
				break;
			case 5:
				System.out.println("GOOD BYE....!!");
				System.exit(0);
				break;
			}

		}
	}

}
