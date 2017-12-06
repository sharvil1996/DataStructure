class TreeList<T> {

	private Tree<T> root;

	public void add(T data) {
		root = add(this.root, data);
	}

	public Tree<T> add(Tree<T> node, T key) {
		if (node == null) {
			node = new Tree<T>(key);
			return node;
		}

		if ((Integer) key < (Integer) node.getData())
			node.setLeft(add(node.getLeft(), key));
		else if ((Integer) key > (Integer) node.getData())
			node.setRight(add(node.getRight(), key));

		return node;
	}

	public void inOrder() {
		inOrder(this.root);
	}

	public void inOrder(Tree<T> node) {
		if (node != null) {
			inOrder(node.getLeft());
			System.out.print(node.getData() + " ");
			inOrder(node.getRight());
		}
	}

	public void postOrder() {
		postOrder(this.root);
	}

	public void postOrder(Tree<T> node) {
		if (node != null) {
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.print(node.getData() + " ");
		}
	}

	public void preOrder() {
		preOrder(this.root);
	}

	public void preOrder(Tree<T> node) {
		if (node != null) {
			System.out.print(node.getData() + " ");
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}

	public void deleteKey(T key) {
		root = delete(this.root, key);
	}

	public Tree<T> delete(Tree<T> node, T key) {
		if (node == null)
			return node;

		if ((Integer) key < (Integer) node.getData())
			node.setLeft(delete(node.getLeft(), key));
		else if ((Integer) key > (Integer) node.getData())
			node.setRight(delete(node.getRight(), key));
		else {
			if (node.getLeft() == null)
				return node.getRight();
			else if (node.getRight() == null)
				return node.getLeft();
			node.setData(minValue(node.getRight()));
			node.setRight(delete(node.getRight(), node.getData()));
		}

		return node;
	}

	public T minValue(Tree<T> node) {
		T minv = node.getData();
		while (node.getLeft() != null) {
			minv = node.getLeft().getData();
			node = node.getLeft();
		}
		return minv;
	}

	public int getSize(Tree<T> tree) {
		if (tree == null)
			return 0;
		else
			return getSize(tree.getLeft()) + getSize(tree.getLeft()) + 1;
	}

	public Tree<T> getRoot() {
		return root;
	}

	public void setRoot(Tree<T> root) {
		this.root = root;
	}

	public void printLevelOrder() {

		int i;
		for (i = 0; i <= getSize(this.root); i++) {
			printGivenLevel(this.root, i);
			System.out.println();
		}
	}

	public void printGivenLevel(Tree<T> node, int level) {
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
