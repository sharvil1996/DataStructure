import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LowestCommonAncestor<T> extends MyTree<T> {

	public static void main(String[] args) throws NumberFormatException, IOException {

		LowestCommonAncestor<Integer> lowestCommonAncestor = new LowestCommonAncestor<Integer>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println();
			System.out.println("1 - Insert");
			System.out.println("2 - Delete");
			System.out.println("3 - Level Wise");
			System.out.println("4 - Find Common Lowest Ancestor");
			System.out.println("5 - Exit");
			System.out.println();
			System.out.println("Enter a choice :: ");
			int choice = Integer.valueOf(bufferedReader.readLine());
			switch (choice) {
			case 1:
				int no = Integer.valueOf(bufferedReader.readLine());
				lowestCommonAncestor.addBST(no);
				break;
			case 2:
				no = Integer.valueOf(bufferedReader.readLine());
				lowestCommonAncestor.deleteKey(no);
				break;
			case 3:
				lowestCommonAncestor.printLevelOrder();
				break;
			case 4:
				System.out.print("Enter element1: ");
				int elem1 = Integer.valueOf(bufferedReader.readLine());
				System.out.print("Enter element2: ");
				int elem2 = Integer.valueOf(bufferedReader.readLine());
				System.out.println(lowestCommonAncestor.commonAncestor(elem1, elem2));
				break;

			case 5:
				System.out.println("GOOD BYE....!!");
				System.exit(0);
				break;
			}
		}
	}
}
