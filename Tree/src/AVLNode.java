
public class AVLNode<T> {

	private AVLNode<T> left;
	private AVLNode<T> right;
	private int height;
	private T data;

	public AVLNode(T data) {
		this.data = data;
		height = 1;
	}

	public AVLNode<T> getLeft() {
		return left;
	}

	public void setLeft(AVLNode<T> left) {
		this.left = left;
	}

	public AVLNode<T> getRight() {
		return right;
	}

	public void setRight(AVLNode<T> right) {
		this.right = right;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
