import java.util.LinkedList;
import java.util.Queue;

public class Heap<T> {
	private int length = 0;
	private Tree<T> head;

	public void add(T elem) {
		Tree<T> newTree = new Tree<T>(elem);
		if (this.head == null) {
			this.head = newTree;
			return;
		}
		Queue<Tree<T>> queue = new LinkedList<>();
		queue.add(this.head);
		this.add(newTree, queue);
	}

	private void add(Tree<T> newTree, Queue<Tree<T>> queue) {
		Queue<Tree<T>> temp = new LinkedList<Tree<T>>();
		for (Tree<T> tempnode : queue)
			temp.add(tempnode);
		for (Tree<T> tempnode : temp)
			if (tempnode.isFull()) {
				queue.add(tempnode.getLeft());
				queue.add(tempnode.getRight());
				queue.poll();
			} else {
				if (tempnode.getLeft() == null)
					tempnode.setLeft(newTree);
				else
					tempnode.setRight(newTree);
				return;
			}
		this.add(newTree, queue);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Tree<T> getHead() {
		return head;
	}

	public void setHead(Tree<T> head) {
		this.head = head;
	}

	public void inOrder(Tree<T> node) {
		if (node != null) {
			inOrder(node.getLeft());
			System.out.print(node.getData() + " ");
			inOrder(node.getRight());
		}
	}

	public void postOrder(Tree<T> node) {
		if (node != null) {
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.print(node.getData() + " ");
		}
	}

	public void preOrder(Tree<T> node) {
		if (node != null) {
			System.out.print(node.getData() + " ");
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}

	public void printLevelOrder() {

		int i;
		for (i = 0; i <= getSize(this.head); i++) {
			printGivenLevel(this.head, i);
			System.out.println();
		}
	}

	private void printGivenLevel(Tree<T> node, int level) {
		if (node == null)
			return;
		if (level == 1)
			System.out.print(node.getData() + " ");
		else if (level > 1) {
			printGivenLevel(node.getLeft(), level - 1);
			printGivenLevel(node.getRight(), level - 1);
		}
	}

	public int getSize(Tree<T> tree) {
		if (tree == null)
			return 0;
		else
			return getSize(tree.getLeft()) + getSize(tree.getRight()) + 1;
	}

	public static boolean isMinHeap(int[] heap) {
		try {
			for (int i = 0; i < heap.length / 2; i++)
				if (heap[i] > heap[2 * (i + 1) - 1])
					return false;
				else if (heap[i] > heap[2 * (i + 1)])
					return false;
		} catch (Exception e) {
			return true;
		}
		return true;
	}

	public static boolean isMaxHeap(int arr[], int n) {
		for (int i = 0; i < (n - 2) / 2; i++) {
			if (arr[2 * i + 1] > arr[i])
				return false;
			if (arr[2 * i + 2] > arr[i])
				return false;
		}
		return true;
	}
	
	public static boolean isMinHeap(int arr[], int n) {
		for (int i = 0; i < (n - 2) / 2; i++) {
			if (arr[2 * i + 1] < arr[i])
				return false;
			if (arr[2 * i + 2] < arr[i])
				return false;
		}
		return true;
	}

	public static boolean isMaxHeap(int[] heap) {
		try {
			for (int i = 0; i < heap.length / 2; i++)
				if (heap[i] < heap[2 * (i + 1) - 1])
					return false;
				else if (heap[i] < heap[2 * (i + 1)])
					return false;
		} catch (Exception e) {
			return true;
		}
		return true;
	}

}
