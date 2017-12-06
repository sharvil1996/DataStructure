import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindInPrderPredecessorSuccessor<T> extends MyTree<T> {

	public static void main(String[] args) throws NumberFormatException, IOException {

		FindInPrderPredecessorSuccessor<Integer> findInPrderPredecessorSuccessor = new FindInPrderPredecessorSuccessor<Integer>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println();
			System.out.println("1 - Insert");
			System.out.println("2 - Delete");
			System.out.println("3 - Level Wise");
			System.out.println("4 - Find Inorder Predecessor Successors");
			System.out.println("5 - Exit");
			System.out.println();
			System.out.println("Enter a choice :: ");
			int choice = Integer.valueOf(bufferedReader.readLine());
			switch (choice) {
			case 1:
				int no = Integer.valueOf(bufferedReader.readLine());
				findInPrderPredecessorSuccessor.addBST(no);
				break;
			case 2:
				no = Integer.valueOf(bufferedReader.readLine());
				findInPrderPredecessorSuccessor.deleteKey(no);
				break;
			case 3:
				findInPrderPredecessorSuccessor.printLevelOrder();
				break;
			case 4:

				System.out.print("Enter element: ");
				int elem = Integer.valueOf(bufferedReader.readLine());
				System.out.println("Inorder Decessor: " + findInPrderPredecessorSuccessor.inorderDecessor(elem));
				System.out.println("Inorder Successor: " + findInPrderPredecessorSuccessor.inorderSuccessor(elem));
				break;

			case 5:
				System.out.println("GOOD BYE....!!");
				System.exit(0);
				break;
			}

		}

	}

}
