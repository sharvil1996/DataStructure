public class Node<T> {
	private T ob;
	private Node<T> left;
	private Node<T> right;
	private int height;

	public Node(T ob) {
		this.ob = ob;
		this.left = null;
		this.right = null;
		this.height = 0;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isFull() {
		return this.left != null && this.right != null;
	}

	public T getData() {
		return this.ob;
	}

	public void setData(T ob) {
		this.ob = ob;
	}

	public void setLeft(Node<T> n) {
		this.left = n;
	}

	public void setRight(Node<T> n) {
		this.right = n;
	}

	public Node<T> getLeft() {
		return this.left;
	}

	public Node<T> getRight() {
		return this.right;
	}

	public String toString() {
		return this.ob.toString();
	}
}
