public class AVLTree {

	private Node node;

	public Node getNode() {
		return node;
	}

	private Node rightRotate(Node root) {
		Node newRoot = root.getLeft();
		root.setLeft(newRoot.getRight());
		newRoot.setRight(root);
		root.height = setHeight(root);
		root.size = setSize(root);
		newRoot.height = setHeight(newRoot);
		newRoot.size = setSize(newRoot);
		return newRoot;

	}

	private Node leftRotate(Node root) {
		Node newRoot = root.getRight();
		root.setRight(newRoot.getLeft());
		newRoot.setLeft(root);
		root.height = setHeight(root);
		root.size = setSize(root);
		newRoot.height = setHeight(newRoot);
		newRoot.size = setSize(newRoot);
		return newRoot;
	}

	private int setHeight(Node root) {
		if (root == null)
			return 0;
		return 1 + Math.max((root.getLeft() != null ? root.getLeft().height : 0),
				(root.getRight() != null ? root.getRight().height : 0));
	}

	private int setSize(Node root) {
		if (root == null)
			return 0;
		return 1 + Math.max((root.getLeft() != null ? root.getLeft().size : 0),
				(root.getRight() != null ? root.getRight().size : 0));
	}

	public void insertAVL(int data) {
		node = insertAVL(this.getNode(), data);
	}

	private Node insertAVL(Node root, int data) {
		if (root == null)
			return new Node(data);
		if (root.getData() > data)
			root.setLeft(insertAVL(root.getLeft(), data));
		else
			root.setRight(insertAVL(root.getRight(), data));

		int balance = balance(root.getLeft(), root.getRight());

		if (balance > 1) {
			if (getHeight(root.getLeft().getLeft()) >= getHeight(root.getLeft().getRight()))
				root = rightRotate(root);
			else {
				root.setLeft(leftRotate(root.getLeft()));
				root = rightRotate(root);
			}
		} else if (balance < -1) {
			if (getHeight(root.getRight().getRight()) >= getHeight(root.getRight().getLeft()))
				root = leftRotate(root);
			else {
				root.setRight(rightRotate(root.getRight()));
				root = leftRotate(root);
			}
		} else {
			root.height = setHeight(root);
			root.size = setSize(root);

		}
		return root;
	}

	private int getHeight(Node node) {
		if (node == null)
			return 0;
		else
			return node.height;
	}

	private int balance(Node leftNode, Node rightNode) {
		return getHeight(leftNode) - getHeight(rightNode);
	}

	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.getLeft());
			System.out.print(root.getData() + " ");
			inOrder(root.getRight());
		}
	}

	public void printLevelWise() {
		for (int i = 0; i <= this.getHeight(this.node); i++) {
			printLevelWise(this.getNode(), i);
			System.out.println();
		}
	}

	public void printLevelWise(Node tree, int level) {

		if (tree == null)
			return;
		if (level == 1)
			System.out.print(tree.getData() + " ");
		if (level > 1) {
			printLevelWise(tree.getLeft(), level - 1);
			printLevelWise(tree.getRight(), level - 1);
		}
	}
}
