
public class MainAVL {

	public static void main(String[] args) {
		AVLTree avlTree = new AVLTree();

		avlTree.insertAVL(20);
		avlTree.insertAVL(15);
		avlTree.insertAVL(10);
		/*avlTree.insertAVL(5);
		avlTree.insertAVL(2);
		avlTree.insertAVL(25);*/
		//avlTree.inOrder(avlTree.getRoot());
		 avlTree.printLevelWise();
		
	
	
	
	
/*        Temp avlTree = new Temp();
        Node root = null;
        root = avlTree.insert(root, -10);
        root = avlTree.insert(root, 2);
        root = avlTree.insert(root, 13);
       root = avlTree.insert(root, 15);
       root = avlTree.insert(root, 17);
       root = avlTree.insert(root, 5);
        root = avlTree.insert(root, -15);
        root = avlTree.insert(root, 15);
        root = avlTree.insert(root, 17);
        root = avlTree.insert(root, 20);

        AVLTree tt = new AVLTree();
        tt.inOrder(root);
        System.out.println();
        tt.preOrder(root);
	System.out.println();
        tt.levelByLevelTwoQueue(root);
	
	
	
	*/
	}
}
