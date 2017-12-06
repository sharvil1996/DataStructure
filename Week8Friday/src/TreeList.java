class TreeList<T> {

	private Tree root;

	public void add(int data) {
		root = insert(root, data);
	}

	public Tree insert(Tree node, int key) {
		if (node == null){
			node = new Tree(key);
			//System.out.println("Inserted" + node.getData());
			return node;
		}
		else if (key < node.getData())
			node.setLeft(insert(node.getLeft(), key));
		else if (key > node.getData())
			node.setRight(insert(node.getRight(), key));

		return node;
	}

	public void inOrder() {
		inOrderDisplay(root);
	}

	public void inOrderDisplay(Tree node) {
		if (node != null) {
			inOrderDisplay(node.getLeft());
			System.out.print(node.getData() + " ");
			inOrderDisplay(node.getRight());
		}
	}

	public void postOrder() {
		postOrderDisplay(root);
	}

	public void postOrderDisplay(Tree node) {
		if (node != null) {
			postOrderDisplay(node.getLeft());
			postOrderDisplay(node.getRight());
			System.out.print(node.getData() + " ");
		}
	}

	public void preOrder() {
		preOrderDisplay(root);
	}

	public void preOrderDisplay(Tree node) {
		if (node != null) {
			System.out.print(node.getData() + " ");
			preOrderDisplay(node.getLeft());
			preOrderDisplay(node.getRight());
		}
	}

	public void deleteKey(int key) {
		root = delete(root, key);
	}

	public Tree delete(Tree node, int key) {
		if (node == null)
			return node;
		if (key < node.getData())
			node.setLeft(delete(node.getLeft(), key));
		else if (key > node.getData())
			node.setRight(delete(node.getRight(), key));
		else {
			System.out.println(node.getData() + "Data");
			
			if (node.getLeft() == null)
				return node.getRight();
			else if (node.getRight() == null)
				return node.getLeft();
			node.setData(minValue(node.getRight()));
			node.setRight(delete(node.getRight(), node.getData()));
		}

		return node;
	}
				
	public int minValue(Tree node) {
		int min = node.getData();
		System.out.println(min + "M");
		while (node.getLeft() != null) {
			min = node.getLeft().getData();
			System.out.println(min + "M,,");
			node = node.getLeft();
		}
		System.out.println(min + "Min");
		return min;
	}

	public int getSize(Tree tree) {
		if (tree == null)
			return 0;
		else
			return getSize(tree.getLeft()) + getSize(tree.getRight()) + 1;
	}

	public Tree getRoot() {
		return root;
	}

	public void setRoot(Tree root) {
		this.root = root;
	}

	public void printLevelOrder() {

		int i;
		for (i = 0; i < getSize(root); i++) {
			printGivenLevel(root, i);
			System.out.println();
		}
	}

	public void printGivenLevel(Tree  node, int level) {
		if (node == null)
			return;
		if (level == 1)
			System.out.print(node.getData() + " ");
		else if (level > 1) {
			printGivenLevel(node.getLeft(), level - 1);
			printGivenLevel(node.getRight(), level - 1);
		}
	}

}
