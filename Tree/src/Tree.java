
public class Tree {

	private int data;
	private Tree left;
	private Tree right;
	private int leftHeight;
	private int rightHeight;

	public Tree(int data) {

		this.data = data;
		left = right = null;
		leftHeight = rightHeight = 0;

	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Tree getLeft() {
		return left;
	}

	public void setLeft(Tree left) {
		this.left = left;
	}

	public Tree getRight() {
		return right;
	}

	public void setRight(Tree right) {
		this.right = right;
	}

	public int getLeftHeight() {
		return leftHeight;
	}

	public void setLeftHeight() {
		if (this.getLeft() != null)
			this.leftHeight = this.getLeft().leftHeight + 1;
	}

	public int getRightHeight() {
		return rightHeight;
	}

	public void setRightHeight() {
		if (this.getRight() != null)
			this.rightHeight = this.getRight().rightHeight + 1;
	}

}
