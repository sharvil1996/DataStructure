
public class BST {

	private Tree root;

	public void insert(int data) {
		root = insert(this.getRoot(), data);
	}

	private Tree insert(Tree tree, int data) {

		if (tree == null) {
			tree = new Tree(data);
			return tree;
		}
		if (data < tree.getData()) {
			tree.setLeft(insert(tree.getLeft(), data));
			tree.setLeftHeight();
		} else if (data > tree.getData()) {
			tree.setRight(insert(tree.getRight(), data));
			tree.setRightHeight();
		}
		return tree;
	}

	public boolean isBalanced(Tree tree) {
		if (Math.abs(tree.getLeftHeight()-tree.getRightHeight())>1)
			return false;
		return true;
	}

	public void printInOrder(Tree node) {
		if (node != null) {
			printInOrder(node.getLeft());
			System.out.print(node.getData() + " ");
			printInOrder(node.getRight());
		}
	}

	public Tree getRoot() {
		return root;
	}

	public void setRoot(Tree root) {
		this.root = root;
	}

}
