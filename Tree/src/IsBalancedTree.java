import java.io.*;

public class IsBalancedTree {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BST binarySearchTree = new BST();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println();
			System.out.println("1 - Add");
			System.out.println("2 - Inorder");
			System.out.println("3 - Is balanced?");
			System.out.println("4 - Exit");
			System.out.print("\nEnter a number ");
			int ch = Integer.parseInt(br.readLine());
			System.out.println();
			switch (ch) {
			case 1:
				binarySearchTree.insert(Integer.parseInt(br.readLine()));
				break;
			case 2:
				binarySearchTree.printInOrder(binarySearchTree.getRoot());
				break;
			case 3:
				System.out.println(binarySearchTree.isBalanced(binarySearchTree.getRoot()));
				break;
			case 4:
				System.out.println("GOOD BYE...!");
				System.exit(0);
				break;
			}
		}

	}

}
