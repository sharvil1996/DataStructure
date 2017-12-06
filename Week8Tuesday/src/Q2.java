
import java.util.*;

public class Q2 {
	public static void main(String args[]) throws EmptyLinkListException {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		DoublyLinkList<Integer> doublyLinkList = new DoublyLinkList<Integer>();
		while (true) {
			System.out.println();
			System.out.println("1 - Insert");
			System.out.println("2 - Delete");
			System.out.println("3 - Display");
			System.out.println("4 - Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println();
				System.out.println("1 - Insert at Begin");
				System.out.println("2 - By Position");
				System.out.println("3 - Insert at End");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					int no = scanner.nextInt();
					doublyLinkList.insertBegin(no);
					break;
				case 2:
					System.out.println("Enter Position :: ");
					int position = scanner.nextInt();
					no = scanner.nextInt();
					doublyLinkList.insertByPosition(no, position);
					break;
				case 3:
					no = scanner.nextInt();
					doublyLinkList.insertEnd(no);
					break;
				}
				break;
			case 2:
				System.out.println();
				System.out.println("1 - Delete at Begin");
				System.out.println("2 - By Position");
				System.out.println("3 - Delete at End");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println(doublyLinkList.deleteBegin() ? "Deleted" : "No nodes...!");
					break;
				case 2:
					int position = scanner.nextInt();
					System.out.println(doublyLinkList.deleteByPosition(position) ? "" : "Position not found...!");
					break;
				case 3:
					System.out.println(doublyLinkList.deleteEnd() ? "Deleted" : "No nodes...!");
					break;
				}
				break;
			case 3:
				doublyLinkList.displayDoublyLinkListNodes();
				break;
			case 4:
				System.out.println("GOOD BYE...!");
				System.exit(0);
				break;
			}
		}
	}
}
