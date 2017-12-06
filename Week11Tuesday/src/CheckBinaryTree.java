
public class CheckBinaryTree<T> extends MyTree<T>{

	public static void main(String[] args) {
		
		CheckBinaryTree<Integer> checkBinaryTree = new CheckBinaryTree<Integer>();
	
		checkBinaryTree.binaryTreeInsert(0, 0, 'l', 15);
		checkBinaryTree.binaryTreeInsert(0, 1, 'l', 5);
		checkBinaryTree.binaryTreeInsert(0, 1, 'r', 20);
		checkBinaryTree.binaryTreeInsert(1, 1, 'l', 8);
		
		System.out.println("Level Wise Print");
		checkBinaryTree.printLevelOrder();
		
		
		System.out.println(checkBinaryTree.isBST()?"Binary Tree":"Not Binary Tree");
	}
	
	
	
}
