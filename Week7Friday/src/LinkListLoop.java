import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkListLoop {
	public static void main(String[] args)
			throws NumberFormatException, IOException, EmptyLinkListException, InvalidIndexException {
		LinkList<Integer> linkListLoop = new LinkList<Integer>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println();
			System.out.println("1 - Add");
			System.out.println("2 - Create Loop");
			System.out.println("3 - Delete Loop");
			System.out.println("4 - Display");
			System.out.println("5 - Exit");
			System.out.println();
			System.out.println("Enter a choice :: ");
			int choice = Integer.valueOf(bufferedReader.readLine());

			switch (choice) {
			case 1:
				linkListLoop.insertLast(Integer.valueOf(bufferedReader.readLine()));
				break;
			case 2:
				linkListLoop.createLoop((Integer.valueOf(bufferedReader.readLine())));
				break;
			case 3:
				linkListLoop.detectLoop();
				break;
			case 4:
				linkListLoop.displayNode();
				break;
			case 5:
				System.out.println("GOOD BYE....!!");
				System.exit(0);
				break;
			}

		}

	}
}
