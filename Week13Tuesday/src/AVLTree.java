
public class AVLTree<T> {
	private int length = 0;
	private Node<T> head;

	public void add(T elem) {
		Node<T> newNode = new Node<T>(elem);
		if (this.head == null) {
			this.head = newNode;
			this.length++;
			return;
		}
		this.head = this.add(this.head, newNode);
		this.length++;
	}

	private Node<T> add(Node<T> node, Node<T> newNode) {
		if (node == null)
			return newNode;
		if ((Integer) newNode.getData() > (Integer) node.getData())
			node.setRight(this.add(node.getRight(), newNode));
		else
			node.setLeft(this.add(node.getLeft(), newNode));
		int leftheight = -1, rightheight = -1;
		if (node.getLeft() != null)
			leftheight = node.getLeft().getHeight();
		if (node.getRight() != null)
			rightheight = node.getRight().getHeight();
		node.setHeight(1 + (leftheight > rightheight ? leftheight : rightheight));
		int diff = leftheight - rightheight;
		if (diff < -1) {
			if ((Integer) node.getRight().getData() < (Integer) newNode.getData())
				return this.left(node);
			else {
				node.setRight(this.right(node.getRight()));
				return this.left(node);
			}
		} else if (diff > 1) {
			if ((Integer) node.getLeft().getData() > (Integer) newNode.getData())
				return this.right(node);
			else {
				node.setLeft(this.left(node.getLeft()));
				return this.right(node);
			}
		}
		return node;
	}

	private Node<T> left(Node<T> node) {
		Node<T> leftside = node.getRight().getLeft();
		Node<T> temp = new Node<T>(node.getData());
		temp.setLeft(node.getLeft());
		node.getRight().setLeft(temp);
		node = node.getRight();
		node.getLeft().setRight(leftside);
		int left = -1, right = -1;
		if (node.getLeft().getRight() != null)
			right = node.getLeft().getRight().getHeight();
		if (node.getLeft().getLeft() != null)
			left = node.getLeft().getLeft().getHeight();
		node.getLeft().setHeight(1 + (left > right ? left : right));
		left = right = -1;
		if (node.getRight() != null)
			right = node.getRight().getHeight();
		if (node.getLeft() != null)
			left = node.getLeft().getHeight();
		node.setHeight(1 + (left > right ? left : right));
		return node;
	}

	private Node<T> right(Node<T> node) {
		Node<T> rightside = node.getLeft().getRight();
		Node<T> temp = new Node<T>(node.getData());
		temp.setRight(node.getRight());
		node.getLeft().setRight(temp);
		node = node.getLeft();
		node.getRight().setLeft(rightside);
		int left = -1, right = -1;
		if (node.getRight().getRight() != null)
			right = node.getRight().getRight().getHeight();
		if (node.getRight().getLeft() != null)
			left = node.getRight().getLeft().getHeight();
		node.getRight().setHeight(1 + (left > right ? left : right));
		left = right = -1;
		if (node.getRight() != null)
			right = node.getRight().getHeight();
		if (node.getLeft() != null)
			left = node.getLeft().getHeight();
		node.setHeight(1 + (left > right ? left : right));
		return node;
	}

	public void inorder() {
		if (this.head == null)
			return;
		this.inorder(this.head);
		System.out.println();
	}

	private void inorder(Node<T> node) {
		if (node == null)
			return;
		this.inorder(node.getLeft());
		System.out.println("Data: " + node.getData() + ", height: " + node.getHeight());
		this.inorder(node.getRight());
	}

	public void preorder() {
		if (this.head == null)
			return;
		this.preorder(this.head);
		System.out.println();
	}

	private void preorder(Node<T> node) {
		if (node == null)
			return;
		System.out.print(node.getData() + ", ");
		this.preorder(node.getLeft());
		this.preorder(node.getRight());
	}

	public void postorder() {
		if (this.head == null)
			return;
		this.postorder(this.head);
		System.out.println();
	}

	private void postorder(Node<T> node) {
		if (node == null)
			return;
		this.postorder(node.getLeft());
		this.postorder(node.getRight());
		System.out.print(node.getData() + ", ");
	}

	public boolean contains(Integer elem) {
		if (this.head == null)
			return false;
		return this.contains(this.head, elem);
	}

	private boolean contains(Node<T> node, Integer elem) {
		if (node.getData().equals(elem))
			return true;
		if ((Integer) elem < (Integer) node.getData()) {
			if (node.getLeft() != null)
				return this.contains(node.getLeft(), elem);
			else
				return false;
		} else {
			if (node.getRight() != null)
				return this.contains(node.getRight(), elem);
			else
				return false;
		}
	}
}
