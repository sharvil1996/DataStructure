import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkListRotate<T> {
	public static void main(String[] args) throws IOException, EmptyLinkListException, InvalidIndexException {

		LinkList<Integer> linkListRotate = new LinkList<Integer>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println();
			System.out.println("1 - Add");
			System.out.println("2 - Rotate Left");
			System.out.println("3 - Rotate Right");
			System.out.println("4 - Display");
			System.out.println("5 - Exit");
			System.out.println();
			System.out.println("Enter a choice :: ");
			int choice = Integer.valueOf(bufferedReader.readLine());

			switch (choice) {
			case 1:
				linkListRotate.insertLast(Integer.valueOf(bufferedReader.readLine()));
				break;
			case 2:
				linkListRotate.rotateLinkListLeft(Integer.valueOf(bufferedReader.readLine()));
				break;
			case 3:
				linkListRotate.rotateLinkListRight(Integer.valueOf(bufferedReader.readLine()));
				break;
			case 4:
				linkListRotate.displayNode();
				break;
			case 5:
				System.out.println("GOOD BYE....!!");
				System.exit(0);
				break;
			}

		}

	}
}
