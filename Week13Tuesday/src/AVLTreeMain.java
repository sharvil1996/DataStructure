import java.util.Scanner;

public class AVLTreeMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ch = 0;
		AVLTree<Integer> avl = new AVLTree<Integer>();
		while (ch != -1) {
			System.out.println("1. Insert Element");
			System.out.println("2. Contains");
			System.out.println("3. Display Elements");
			System.out.println("-1. Exit");
			System.out.print("Choice: ");
			ch = scan.nextInt();
			switch (ch) {
			case 1:
				System.out.print("Enter element: ");
				avl.add(scan.nextInt());
				break;
			case 2:
				System.out.print("Enter element: ");
				System.out.println(avl.contains(scan.nextInt()));
				break;
			case 3:
				System.out.println("In-order");
				avl.inorder();
				System.out.println("Post-order");
				avl.postorder();
				System.out.println("Pre-order");
				avl.preorder();
				break;
			}
		}
	}
}
