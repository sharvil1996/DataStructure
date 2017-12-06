import java.util.Scanner;

public class Temp<T> extends TreeTemp<T> {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Temp<Integer> temp = new Temp<Integer>();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("1 - Add");
			System.out.println("2 - Delete");
			System.out.println("3 - Inorder");
			System.out.println("4 - Preorder");
			System.out.println("5 - Postorder");
			System.out.println("6 - Level Wise");
			System.out.println("7 - Size");
			System.out.println("8 - Contain");
			System.out.println("9 - Inorder Predecessor");
			System.out.println("10 - Inorder Successor");
			System.out.println("11 - Lowest Common Ancestor");
			System.out.println("12 - Convert to MIN Heap");
			System.out.println("13 - Convert to MAX Heap");
			System.out.println("14 - Exit");
			System.out.print("\nEnter a number ");
			int ch = scanner.nextInt();
			System.out.println();
			switch (ch) {
			case 1:
				temp.addBST(scanner.nextInt());
				break;
			case 2:
				temp.delete(scanner.nextInt());
				break;
			case 3:
				temp.inOrder(temp.getRoot());
				break;
			case 4:
				temp.preOrder(temp.getRoot());
				break;
			case 5:
				temp.postOrder(temp.getRoot());
				break;
			case 6:
				temp.printLevelWise();
				break;
			case 7:
				System.out.println(temp.getSize(temp.getRoot()));
				break;
			case 8:
				System.out.println(temp.contain(temp.getRoot(), scanner.nextInt()));
				break;
			case 9:
				System.out.println(temp.findInOrderPredecessor(scanner.nextInt()));
				break;
			case 10:
				System.out.println(temp.findInOrderSuccessor(scanner.nextInt()));
				break;
			case 11:
				System.out.println(temp.findLowestCommonAncestor(temp.getRoot(), scanner.nextInt(), scanner.nextInt()));
				break;
			case 12:
				temp.getArray();
				temp.convertMinHeap(temp.temp, temp.k);
				break;
			case 13:
				temp.getArray();
				temp.convertMaxHeap(temp.temp, temp.k);
				break;
			case 14:
				System.out.println("GOOD BYE...!");
				System.exit(0);
				break;
			}
		}

	}

}
