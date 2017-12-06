import java.util.Scanner;

public class BinaryToAVL {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int ch = 0;
		BinaryTree<Integer> tree = new BinaryTree<Integer>();
		while (ch != -1) {
			System.out.println("1. Insert Element");
			System.out.println("2. Traverse");
			System.out.println("3. is BinarySearchTree?");
			System.out.println("4. Convert to AVL Tree");
			System.out.println("-1. Exit");
			System.out.print("Choice: ");
			ch = scan.nextInt();
			switch (ch) {
			case 1: {
				System.out.print("Enter element: ");
				tree.add(scan.nextInt());
				break;
			}
			case 2: {
				System.out.println("InOrder");
				tree.inorder();
				System.out.println("PreOrder");
				tree.preorder();
				System.out.println("PostOrder");
				tree.postorder();
				break;
			}
			case 3: {
				System.out.println(tree.isBST());
				break;
			}
			case 4: {
				String[] elements = tree.inorderString().split(",");
				AVLTree<Integer> avl = new AVLTree<>();
				for (String s : elements)
					avl.add(Integer.parseInt(s));
				System.out.println("preorder");
				avl.preorder();
				break;
			}
			}
		}
	}
}
