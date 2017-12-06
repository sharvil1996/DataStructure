
public class Tree<T> {

	private T data;
	private Tree<T> left;
	private Tree<T> right;

	public Tree() {
		this.left = this.right = this.left = null;
	}

	public Tree(T data) {

		this.left = null;
		this.right = null;
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Tree<T> getLeft() {
		return left;
	}

	public void setLeft(Tree<T> left) {
		this.left = left;
	}

	public Tree<T> getRight() {
		return right;
	}

	public void setRight(Tree<T> right) {
		this.right = right;
	}

}
