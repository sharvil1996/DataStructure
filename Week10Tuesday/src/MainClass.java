
public class MainClass<T> {

	public static void main(String[] args) {

		MyTree<Integer> myTree = new MyTree<Integer>();

		myTree.insert(0, 0, 'l', 1);
		
		myTree.insert(0, 1, 'l', 2);
		myTree.insert(0, 1, 'r', 3);

		myTree.insert(1, 1, 'l', 4);
		myTree.insert(1, 1, 'r', 5);
		myTree.insert(1, 2, 'l', 6);
		myTree.insert(1, 2, 'r', 7);

		myTree.insert(2, 1, 'l', 8);
		myTree.insert(2, 1, 'r', 9);
		myTree.insert(2, 2, 'l', 10);
		myTree.insert(2, 2, 'r', 11);

		myTree.insert(2, 3, 'l', 12);
		myTree.insert(2, 3, 'r', 13);
		myTree.insert(2, 4, 'l', 14);
		myTree.insert(2, 4, 'r', 15);
		
		myTree.inOrder(myTree.getRoot());
		System.out.println();
		myTree.printLevelOrder();

		
		/*String temp  = myTree.inOrder1(myTree.getRoot());
		System.out.println(temp);
		*/
		
		

	}

}
