import java.util.Scanner;

public class BalancedTree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ch = 0;
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		while (ch != -1) {
			System.out.println("1. Insert Element");
			System.out.println("2. Is balanced");
			System.out.println("3. Display");
			System.out.println("-1. Exit");
			System.out.print("Choice: ");
			ch = scan.nextInt();
			switch (ch) {
			case 1: {
				System.out.print("Enter element: ");
				bst.add(scan.nextInt());
				break;
			}
			case 2: {
				System.out.println(bst.isBalanced());
				break;
			}
			case 3: {
				System.out.println("Inorder");
				bst.inorder();
				System.out.println("Preorder");
				bst.preorder();
				System.out.println("Postorder");
				bst.postorder();
				break;
			}
			}
		}
	}
}
