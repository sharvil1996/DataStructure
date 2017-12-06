import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree<T> {
	private int length = 0;
	private Node<T> head;

	public void add(T elem) {
		Node<T> newNode = new Node<T>(elem);
		if (this.head == null) {
			this.head = newNode;
			this.length++;
			return;
		}
		this.addInteger(this.head, newNode);
		this.length++;
	}

	private void addInteger(Node<T> node, Node<T> newNode) {
		if ((Integer) newNode.getData() > (Integer) node.getData()) {
			if (node.getRight() != null) {
				this.addInteger(node.getRight(), newNode);
				if (node.getHeight() < node.getRight().getHeight() + 1)
					node.setHeight(node.getRight().getHeight() + 1);
			} else {
				node.setRight(newNode);
				newNode.setHeight(0);
				if (node.getLeft() == null)
					node.setHeight(1);
			}
		} else {
			if (node.getLeft() != null) {
				this.addInteger(node.getLeft(), newNode);
				if (node.getHeight() < node.getLeft().getHeight() + 1)
					node.setHeight(node.getLeft().getHeight() + 1);
			} else {
				node.setLeft(newNode);
				newNode.setHeight(0);
				if (node.getRight() == null)
					node.setHeight(1);
			}
		}
	}

	public boolean isBalanced() {
		if (this.head == null)
			return false;
		Queue<Node<T>> queue = new LinkedList<>();
		queue.add(this.head);
		while (!queue.isEmpty()) {
			Node<T> tempnode = (Node<T>) queue.peek();
			int leftheight = -1, rightheight = -1;
			if (tempnode.getLeft() != null) {
				leftheight = tempnode.getLeft().getHeight();
				queue.add(tempnode.getLeft());
			}
			if (tempnode.getRight() != null) {
				rightheight = tempnode.getRight().getHeight();
				queue.add(tempnode.getRight());
			}
			queue.poll();
			if ((leftheight - rightheight) < -1 || (leftheight - rightheight) > 1)
				return false;
		}
		return true;
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
		System.out.print("Data: " + node.getData() + ", height: " + node.getHeight() + " :: ");
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
}
