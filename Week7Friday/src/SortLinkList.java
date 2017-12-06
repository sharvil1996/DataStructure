import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortLinkList<T> {
	public static void main(String[] args) throws IOException, EmptyLinkListException, InvalidIndexException {

		LinkList<Integer> linkList = new LinkList<Integer>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println();
			System.out.println("1 - ADD");
			System.out.println("2 - Display LinkList");
			System.out.println("3 - Sort");
			System.out.println("4 - Exit");
			System.out.println();
			System.out.println("Enter a choice :: ");
			int choice = Integer.valueOf(bufferedReader.readLine());
			switch (choice) {
			case 1:
				int no = Integer.valueOf(bufferedReader.readLine());
				linkList.insertLast(no);
				break;
			case 2:
				linkList.displayNode();
				break;
			case 3:
				linkList.sortInteger();
				break;
			case 4:
				System.out.println("GOOD BYE....!!");
				System.exit(0);
				break;
			}

		}
	}
}
