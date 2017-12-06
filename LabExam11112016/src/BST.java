
public class BST<T> extends Tree<T> {

	private Tree<T> root;

	public void insertBST(T data) {
		root = insertBST(this.getRoot(), data);
	}

	private Tree<T> insertBST(Tree<T> tree, T data) {

		if (tree == null)
			return new Tree<T>(data);
		if ((Integer) data < (Integer) tree.getData())
			tree.setLeft(this.insertBST(tree.getLeft(), data));
		else if ((Integer) data > (Integer) tree.getData())
			tree.setRight(this.insertBST(tree.getRight(), data));
		return tree;

	}

	public int getHeight(Tree<T> tree) {
		if (tree == null)
			return 0;
		else
			return getHeight(tree.getLeft()) + getHeight(tree.getRight()) + 1;
	}

	public void printLevelWise() {
		
		for (int i = 0; i <= this.getHeight(this.getRoot()); i++) {
			printLevelWise(this.getRoot(), i);
			System.out.println();
		}
	}

	public void printLevelWise(Tree<T> tree, int level) {

		if (tree == null)
			return;
		if (level == 1)
			System.out.print(tree.getData() + " ");
		if (level > 1) {
			printLevelWise(tree.getLeft(), level - 1);
			printLevelWise(tree.getRight(), level - 1);
		}
	}

	public Tree<T> getRoot() {
		return root;
	}

	public void setRoot(Tree<T> root) {
		this.root = root;
	}

}
