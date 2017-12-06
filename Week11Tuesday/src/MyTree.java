
import java.util.HashMap;
import java.util.Map;

public class MyTree<T> {

	private Tree<T> root;
	private Map<Integer, Tree<T>> trees;

	public MyTree() {
		trees = new HashMap<Integer, Tree<T>>();
	}

	public Tree<T> binaryTreeInsert(int level, int parent, char side, T data) {
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

	public void addBST(T data) {
		root = addBST(this.root, data);
	}

	private Tree<T> addBST(Tree<T> node, T key) {
		if (node == null) {
			node = new Tree<T>(key);
			return node;
		}

		if ((Integer) key < (Integer) node.getData())
			node.setLeft(addBST(node.getLeft(), key));
		else if ((Integer) key > (Integer) node.getData())
			node.setRight(addBST(node.getRight(), key));

		return node;
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

	public boolean contains(Tree<T> tree, T element) {
		if (tree.getData().equals(element))
			return true;
		if ((Integer) element < (Integer) tree.getData()) {
			if (tree.getLeft() != null)
				return contains(tree.getLeft(), element);
			else
				return false;
		}
		if ((Integer) element > (Integer) tree.getData()) {
			if (tree.getRight() != null)
				return contains(tree.getRight(), element);
			else
				return false;
		}
		return false;
	}

	public void deleteKey(T key) {
		root = delete(this.root, key);
	}

	public Tree<T> delete(Tree<T> node, T key) {
		if (node == null)
			return node;

		if ((Integer) key < (Integer) node.getData())
			node.setLeft(delete(node.getLeft(), key));
		else if ((Integer) key > (Integer) node.getData())
			node.setRight(delete(node.getRight(), key));
		else {
			//No Child and 1 Child
			if (node.getLeft() == null)
				return node.getRight();
			else if (node.getRight() == null)
				return node.getLeft();
			node.setData(minValue(node.getRight()));
			node.setRight(delete(node.getRight(), node.getData()));
		}
		return node;
	}

	public T minValue(Tree<T> node) {
		T minv = node.getData();
		while (node.getLeft() != null) {
			minv = node.getLeft().getData();
			node = node.getLeft();
		}
		return minv;
	}

	public String sortedString() {
		return sortedString(this.getRoot(), new String());
	}

	private String sortedString(Tree<T> tree, String str) {
		if (tree.getLeft() == null && tree.getRight() == null)
			return str += tree.getData() + ",";
		if (tree.getLeft() != null)
			str = sortedString(tree.getLeft(), str);
		str += tree.getData() + ",";
		if (tree.getRight() != null)
			str = sortedString(tree.getRight(), str);
		return str;
	}

	public boolean isBST() {
		if (this.getRoot() == null)
			return false;
		String[] str = this.sortedString().split(",");
		for (int i = 1; i < str.length; i++)
			if (Integer.parseInt(str[i - 1]) > Integer.parseInt(str[i]))
				return false;
		return true;
	}

	private Tree<T> find(T elem) {
		if (this.getRoot() == null)
			return null;
		if (!this.contains(this.getRoot(), (T) elem))
			return null;
		return this.find(this.getRoot(), elem);
	}

	private Tree<T> find(Tree<T> node, T elem) {
		Tree<T> data = node;
		if ((Integer) elem < (Integer) node.getData())
			data = this.find(node.getLeft(), elem);
		else if ((Integer) elem > (Integer) node.getData())
			data = this.find(node.getRight(), elem);
		return data;
	}

	public T inorderDecessor(T elem) {
		Tree<T> node = this.find(elem);
		if (node == null)
			return null;
		if (node.getLeft() == null)
			return null;
		return this.inorderDecessor(node.getLeft()).getData();
	}

	private Tree<T> inorderDecessor(Tree<T> node) {
		Tree<T> data = node;
		if (data.getRight() != null)
			data = this.inorderDecessor(data.getRight());
		return data;
	}

	public T inorderSuccessor(T elem) {
		Tree<T> node = this.find(elem);
		if (node == null)
			return null;
		if (node.getLeft() == null)
			return null;
		return this.inorderSuccessor(node.getRight()).getData();
	}

	private Tree<T> inorderSuccessor(Tree<T> node) {
		Tree<T> data = node;
		if (data.getLeft() != null)
			data = this.inorderSuccessor(data.getRight());
		return data;
	}

	public T commonAncestor(T elem1, T elem2) {
		if (this.contains(this.getRoot(), elem1) && this.contains(this.getRoot(), elem2))
			return this.commonAncestor(this.getRoot(), elem1, elem2);
		return null;
	}

	private T commonAncestor(Tree<T> node, T elem1, T elem2) {
		T elem = node.getData();
		if ((Integer) elem1 < (Integer) node.getData() && (Integer) elem2 < (Integer) node.getData())
			elem = this.commonAncestor(node.getLeft(), elem1, elem2);
		else if ((Integer) elem1 > (Integer) node.getData() && (Integer) elem2 > (Integer) node.getData())
			elem = this.commonAncestor(node.getRight(), elem1, elem2);
		return elem;
	}
}
