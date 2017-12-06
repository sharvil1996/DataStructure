import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareLinkList<T> {
	public static void main(String[] args) throws IOException, EmptyLinkListException, InvalidIndexException {

		LinkList<Integer> linkList1 = new LinkList<Integer>();
		LinkList<Integer> linkList2 = new LinkList<Integer>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println();
			System.out.println("1 - ADD LinkList 1");
			System.out.println("2 - ADD LinkList 2");
			System.out.println("3 - Display LinkList 1");
			System.out.println("4 - Display LinkList 2");
			System.out.println("5 - Compare LinkList");
			System.out.println("6 - Exit");
			System.out.println();
			System.out.println("Enter a choice :: ");
			int choice = Integer.valueOf(bufferedReader.readLine());
			switch (choice) {
			case 1:
				int no = Integer.valueOf(bufferedReader.readLine());
				linkList1.insertLast(no);
				break;
			case 2:
				no = Integer.valueOf(bufferedReader.readLine());
				linkList2.insertLast(no);
				break;
			case 3:
				linkList1.displayNode();
				break;
			case 4:
				linkList2.displayNode();
				break;
			case 5:
				System.out.println(linkList1.compare(linkList2));
				break;
			case 6:
				System.out.println("GOOD BYE....!!");
				System.exit(0);
				break;
			}

		}
	}
}
