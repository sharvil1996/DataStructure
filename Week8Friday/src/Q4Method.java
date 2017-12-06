public class Q4Method{
	
	private Tree root;

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

}