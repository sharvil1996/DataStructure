
public class Node {

	public int height;
	public int size;
	private int data;
	private Node left;
	private Node right;

	public Node(int data) {

		this.data = data;
		this.height = this.size = 1;
		this.setLeft(null);
		this.setRight(null);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}
