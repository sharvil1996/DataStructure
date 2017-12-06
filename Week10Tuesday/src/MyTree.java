import java.util.HashMap;
import java.util.Map;

public class MyTree<T> {

	private Tree<T> root;
	private Map<Integer, Tree<T>> trees;

	public MyTree() {
		trees = new HashMap<Integer, Tree<T>>();
	}

	public Tree<T> insert(int level, int parent, char side, T data) {
		Tree<T> tree = new Tree<T>(data);
		if (this.getRoot() == null) {
			trees.put(0, tree);
			root = tree;
		} else {

			if (side == 'l') {
				trees.get((int) Math.pow(2, level) - 1 + parent - 1).setLeft(tree);
				trees.put((((int) Math.pow(2, level) - 1 + parent - 1) * 2) + 1, tree);
			} else {
				trees.get((int) Math.pow(2, level) - 1 + parent - 1).setRight(tree);
				trees.put((((int) Math.pow(2, level) - 1 + parent - 1) * 2) + 2, tree);
			}

		}

		return tree;
	}

	public Map<Integer, Tree<T>> getTrees() {
		return trees;
	}

	public void setTrees(Map<Integer, Tree<T>> trees) {
		this.trees = trees;
	}

	public Tree<T> getRoot() {
		return root;
	}

	public void setRoot(Tree<T> root) {
		this.root = root;
	}

	public void inOrder(Tree<T> node) {
		if (node != null) {
			inOrder(node.getLeft());
			System.out.print(node.getData() + " ");
			inOrder(node.getRight());
		}
	}

	public String inOrder1(Tree<T> node) {
		String temp = new String();
		if (node != null) {
			inOrder(node.getLeft());
			// System.out.print(node.getData() + " ");
			temp += node.getData() + "H";
			inOrder(node.getRight());
		}
		return temp;
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
		for (i = 0; i <= getSize(this.root); i++) {
			printGivenLevel(this.root, i);
			System.out.println();
		}
	}

	public void printGivenLevel(Tree<T> node, int level) {
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
	/*
	 * public Tree<T> BSTToMinHeap(Tree<T> tree) { Tree<T> temp = null;
	 * 
	 * return null; }
	 * 
	 * public void BSTToSortedTree(Tree<T> tree,Tree<T> temp){ if(tree == null)
	 * return; tree.setRight(temp); if(temp!=null) temp.setLeft(null); temp=
	 * tree; BSTToSortedTree(tree.getLeft(), temp); }
	 */
}
