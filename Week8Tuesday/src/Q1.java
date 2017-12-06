
import java.util.*;

public class Q1 {
	public static void main(String args[]) throws EmptyLinkListException {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		CircularLinkList<Integer> circularLinkList = new CircularLinkList<Integer>();
		while (true) {
			System.out.println();
			System.out.println("1 - Insert");
			System.out.println("2 - Delete");
			System.out.println("3 - Display");
			System.out.println("4 - Reverse");
			System.out.println("5 - Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println();
				System.out.println("1 - Insert at Begin");
				System.out.println("2 - Insert at Middle");
				System.out.println("3 - Insert at End");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					int no = scanner.nextInt();
					circularLinkList.insertBegin(no);
					break;
				case 2:
					System.out.println("Enter Position :: ");
					int position = scanner.nextInt();
					no = scanner.nextInt();
					circularLinkList.insertByPosition(no, position);
					break;
				case 3:
					no = scanner.nextInt();
					circularLinkList.insertLast(no);
					break;
				}
				break;
			case 2:
				System.out.println();
				System.out.println("1 - Delete at Begin");
				System.out.println("2 - Delete at Middle");
				System.out.println("3 - Delete at End");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println(circularLinkList.deleteBegin() ? "Deleted" : "No nodes...!");
					break;
				case 2:
					int position = scanner.nextInt();
					System.out.println(circularLinkList.deleteByPosition(position) ? "" : "Position not found...!");
					break;
				case 3:
					System.out.println(circularLinkList.deleteEnd() ? "Deleted" : "No nodes...!");
					;
					break;
				}
				break;
			case 3:
				circularLinkList.displayNode();
				break;
			case 4:
				circularLinkList.reverse();
				break;
			case 5:
				System.out.println("GOOD BYE...!");
				System.exit(0);
				break;
			}
		}
	}
}
