import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {
	private int length = 0;
	private Node<T> head;

	public void add(T elem) {
		Node<T> newNode = new Node<T>(elem);
		if (this.head == null) {
			this.head = newNode;
			this.length++;
			return;
		}
		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.add(this.head);
		this.add(queue, newNode);
		this.length++;
	}

	private void add(Queue<Node<T>> queue, Node<T> newNode) {
		Queue<Node<T>> temp = new LinkedList<Node<T>>();
		for (Node<T> tempnode : queue)
			temp.add(tempnode);
		for (Node<T> tempnode : temp) {
			if (tempnode.isFull()) {
				queue.add(tempnode.getLeft());
				queue.add(tempnode.getRight());
				queue.poll();
			} else {
				if (tempnode.getLeft() == null)
					tempnode.setLeft(newNode);
				else
					tempnode.setRight(newNode);
				return;
			}
		}
		this.add(queue, newNode);
	}

	public void preorder() {
		if (this.head == null)
			return;
		this.preorder(this.head);
		System.out.println();
	}

	private void preorder(Node<T> node) {
		if (node != null) {
			System.out.print(node.getData() + ", ");
			this.preorder(node.getLeft());
			this.preorder(node.getRight());
		}
	}

	public void postorder() {
		if (this.head == null)
			return;
		this.postorder(this.head);
		System.out.println();
	}

	private void postorder(Node<T> node) {
		if (node != null) {
			this.postorder(node.getLeft());
			this.postorder(node.getRight());
			System.out.print(node.getData() + ", ");
		}
	}

	public boolean isBST() {
		if (this.head == null)
			return false;
		String[] str = this.inorderString().split(",");
		for (int i = 1; i < str.length; i++)
			if (Integer.parseInt(str[i - 1]) > Integer.parseInt(str[i]))
				return false;
		return true;
	}

	public String inorderString() {
		if (this.head == null)
			return "";
		String str = "";
		return this.inorderString(this.head, str);
	}

	public String inorderString(Node<T> node, String str) {
		if (node != null) {
			str = this.inorderString(node.getLeft(), str);
			str += node.getData() + ",";
			str = this.inorderString(node.getRight(), str);
		}
		return str;
	}

	public void inorder() {
		if (this.head == null)
			return;
		this.inorder(this.head);
		System.out.println();
	}

	private void inorder(Node<T> node) {
		if (node != null) {
			this.inorder(node.getLeft());
			System.out.print(node.getData() + ", ");
			this.inorder(node.getRight());
		}
	}
}
