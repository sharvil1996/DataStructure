
class TreeTemp<T> {

	private Tree<T> root;

	public void addBST(T Element) {
		root = addBST(this.getRoot(), Element);
	}

	private Tree<T> addBST(Tree<T> tree, T Element) {
		if (tree == null) {
			tree = new Tree<T>(Element);
			return tree;
		}
		if ((Integer) Element < (Integer) tree.getData())
			tree.setLeft(addBST(tree.getLeft(), Element));
		else if ((Integer) Element > (Integer) tree.getData())
			tree.setRight(addBST(tree.getRight(), Element));
		return tree;

	}

	public void inOrder(Tree<T> tree) {
		if (tree != null) {
			inOrder(tree.getLeft());
			System.out.print(tree.getData() + " ");
			inOrder(tree.getRight());
		}
	}

	public void preOrder(Tree<T> tree) {
		if (tree != null) {
			System.out.print(tree.getData() + " ");
			preOrder(tree.getLeft());
			preOrder(tree.getRight());
		}
	}

	public void postOrder(Tree<T> tree) {
		if (tree != null) {
			postOrder(tree.getLeft());
			postOrder(tree.getRight());
			System.out.print(tree.getData() + " ");
		}
	}

	public int getSize(Tree<T> tree) {
		if (tree == null)
			return 0;
		else
			return getSize(tree.getLeft()) + getSize(tree.getRight()) + 1;
	}

	public void printLevelWise() {
		for (int i = 0; i <= this.getSize(this.root); i++) {
			printLevelWise(this.getRoot(), i);
			System.out.println();
		}
	}

	public void printLevelWise(Tree<T> tree, int level) {

		if (tree == null)
			return;
		if (level == 1)
			System.out.print(tree.getData() + " ");
		if (level > 1) {
			printLevelWise(tree.getLeft(), level - 1);
			printLevelWise(tree.getRight(), level - 1);
		}
	}

	public void delete(T element) {
		root = delete(this.getRoot(), element);
	}

	public Tree<T> delete(Tree<T> tree, T element) {
		if (tree == null)
			return null;
		if ((Integer) element < (Integer) tree.getData())
			tree.setLeft(delete(tree.getLeft(), element));
		else if ((Integer) element > (Integer) tree.getData())
			tree.setRight(delete(tree.getRight(), element));
		else {
			
			if (tree.getLeft() == null)
				return tree.getRight();
			else if (tree.getRight() == null)
				return tree.getLeft();
			else {
				T min = minValue(tree.getRight());
				tree.setData(min);
				System.out.println(tree.getData());
				tree.setRight(delete(tree.getRight(), tree.getData()));
			}
		}
		return tree;
	}

	public T minValue(Tree<T> tree) {
		while (tree.getLeft() != null) {
			tree = tree.getLeft();
		}
		return tree.getData();
	}

	public boolean contain(Tree<T> tree, T element) {
		if (tree.getData().equals(element))
			return true;
		if ((Integer) element < (Integer) tree.getData()) {
			if (tree.getLeft() != null)
				return contain(tree.getLeft(), element);
		}
		if ((Integer) element > (Integer) tree.getData()) {
			if (tree.getRight() != null)
				return contain(tree.getRight(), element);
		}
		return false;

	}

	public Tree<T> find(T element) {
		if (this.getRoot() == null)
			return null;
		if (!this.contain(this.getRoot(), element))
			return null;

		return find(this.getRoot(), element);
	}

	public Tree<T> find(Tree<T> tree, T element) {

		Tree<T> temp = tree;
		if ((Integer) element < (Integer) temp.getData())
			temp = find(tree.getLeft(), element);
		if ((Integer) element > (Integer) temp.getData())
			temp = find(tree.getRight(), element);
		return temp;
	}

	public T findInOrderPredecessor(T element) {
		Tree<T> node = this.find(element);
		if (node == null)
			return null;
		if (node.getLeft() == null)
			return null;
		return this.findInOrderPredecessor(node.getLeft()).getData();
	}

	private Tree<T> findInOrderPredecessor(Tree<T> temp) {
		Tree<T> node = temp;
		if (node.getRight() != null)
			node = this.findInOrderPredecessor(temp.getRight());
		return node;
	}

	public T findInOrderSuccessor(T element) {
		Tree<T> temp = this.find(element);
		if (temp == null)
			return null;
		if (temp.getLeft() == null)
			return null;
		return this.findInOrderSuccessor(temp.getRight()).getData();
	}

	private Tree<T> findInOrderSuccessor(Tree<T> temp) {

		Tree<T> node = temp;
		if (temp.getLeft() != null)
			node = this.findInOrderSuccessor(temp.getRight());
		return node;
	}

	public Tree<T> findLowestCommonAncestor(Tree<T> node, T n1, T n2) {
		if (node == null)
			return null;
		if ((Integer) node.getData() > (Integer) n1 && (Integer) node.getData() > (Integer) n2)
			return findLowestCommonAncestor(node.getLeft(), n1, n2);
		if ((Integer) node.getData() < (Integer) n1 && (Integer) node.getData() < (Integer) n2)
			return findLowestCommonAncestor(node.getRight(), n1, n2);
		return node;
	}

	public Tree<T> getRoot() {
		return root;
	}

	public void setRoot(Tree<T> root) {
		this.root = root;
	}
	

	int temp[] = new int[50];
	int k = 0;
	
	public void getArray() {
		for (int i = 0; i <= this.getSize(this.root); i++) {
			getArray(this.getRoot(), i);
		}
	}
	
	public void getArray(Tree<T> tree, int level) {
		if (tree == null)
			return;
		if (level == 1)
			temp[k++] = (Integer)tree.getData();
		if (level > 1) {
			printLevelWise(tree.getLeft(), level - 1);
			printLevelWise(tree.getRight(), level - 1);
		}
	}

	public void convertMaxHeap(int arr[], int n) {
		for (int i = (n - 2) / 2; i >= 0; --i)// last root
			MaxHeap(arr, i, n);
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
	}

	public void convertMinHeap(int arr[], int n) {
		for (int i = (n - 2) / 2; i >= 0; --i)// last root
			MinHeap(arr, i, n);
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
	}

	public void MinHeap(int arr[], int i, int n) {
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int largest = i;
		if (l < n && arr[l] < arr[i])
			largest = l;
		if (r < n && arr[r] < arr[largest])
			largest = r;
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			MinHeap(arr, largest, n);
		}
	}

	public void MaxHeap(int arr[], int i, int n) {
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int largest = i;
		if (l < n && arr[l] > arr[i])
			largest = l;
		if (r < n && arr[r] > arr[largest])
			largest = r;
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			MaxHeap(arr, largest, n);
		}
	}

}
