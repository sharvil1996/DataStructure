public class LinkList<T> {
	private Node<T> head;
	private int length = 0;

	public void insertBegin(T data) {
		if (this.head == null)
			this.head = new Node<T>(data);
		else {
			Node<T> temp = new Node<T>(data);
			temp.setNext(this.head);
			this.head = temp;
		}
	}

	public void insertLast(T data) {
		if (this.head == null) {
			this.head = new Node<T>(data);

		} else {
			Node<T> temp = this.head;
			while (temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(new Node<T>(data));
		}
		this.length++;
	}

	public void insertByPosition(T data, int position) {
		if (position == 1) {
			if (this.head == null)
				this.head = new Node<T>(data);
			else
				insertBegin(data);
		} else {
			int cnt = 1;
			Node<T> temp = this.head;
			Node<T> previous = null;
			while (temp != null) {
				if (position == cnt)
					break;
				previous = temp;
				temp = temp.getNext();
				cnt++;
			}
			Node<T> newNode = new Node<T>(data);
			previous.setNext(newNode);
			newNode.setNext(temp);
		}
	}

	public boolean insertByBeforeValue(T key, T data) {
		Node<T> temp = this.head;
		Node<T> previous = null;
		if (head.getData() == key) {
			insertBegin(data);
			return true;
		}
		while (temp != null) {
			if (temp.getData() == key) {
				Node<T> newNode = new Node<T>(data);
				previous.setNext(newNode);
				newNode.setNext(temp);
				return true;
			}
			previous = temp;
			temp = temp.getNext();
		}
		return false;
	}

	public boolean insertByAfterValue(T key, T data) {
		Node<T> temp = this.head;
		while (temp != null) {
			if (temp.getData() == key) {
				Node<T> newNode = new Node<T>(data);
				newNode.setNext(temp.getNext());
				temp.setNext(newNode);
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	public void displayNode() {
		System.out.println();
		Node<T> temp = this.head;
		if (this.head == null)
			System.out.println("No Nodes...!");
		else {
			while (temp != null) {
				System.out.print(temp.getData() + " ");
				temp = temp.getNext();
			}
		}
	}

	public boolean deleteBegin() {
		if (this.head == null)
			return false;
		else {
			this.head = this.head.getNext();
			return true;
		}
	}

	public boolean deleteEnd() throws EmptyLinkListException {
		if (this.head == null)
			throw new EmptyLinkListException();
		else if (this.head.getNext() == null) {
			this.head = null;
			return true;
		} else {
			Node<T> temp = this.head;
			Node<T> previous = null;
			while (temp.getNext() != null) {
				previous = temp;
				temp = temp.getNext();
			}
			previous.setNext(null);
			return true;
		}
	}

	public boolean deleteByPosition(int position) {
		if (position == 1) {
			deleteBegin();
			return true;
		} else {
			int cnt = 1;
			Node<T> temp = this.head;
			Node<T> previous = null;
			while (temp != null) {
				if (cnt == position) {
					previous.setNext(temp.getNext());
					return true;
				}
				previous = temp;
				temp = temp.getNext();
				cnt++;
			}
		}
		return false;
	}

	public boolean deleteByValue(T data) {
		if (this.head.getData() == data) {
			deleteBegin();
			return true;
		} else {
			Node<T> temp = this.head;
			Node<T> previous = null;
			while (temp != null) {
				if (temp.getData() == data) {
					previous.setNext(temp.getNext());
					return true;
				}
				previous = temp;
				temp = temp.getNext();
			}
		}
		return false;
	}

	public void reverse() {
		Node<T> previous = null;
		Node<T> current = this.head;
		Node<T> nextNode = null;
		while (current != null) {
			nextNode = current.getNext();
			current.setNext(previous);
			previous = current;
			current = nextNode;
		}
		this.head = previous;
	}

	public Node<T> getHead() {
		return this.head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getLastNode() throws EmptyLinkListException {
		Node<T> temp = head;
		if (this.head == null)
			throw new EmptyLinkListException();
		else {
			while (temp.getNext() != null)
				temp = temp.getNext();
		}
		return temp;
	}

	public Node<T> getNode(int index) throws EmptyLinkListException, InvalidIndexException {

		int cnt = 0;
		if (getHead() == null)
			throw new EmptyLinkListException();
		Node<T> temp = getHead();
		while (temp != null) {
			if (++cnt == index) {
				return temp;
			}
			temp = temp.getNext();
		}
		throw new InvalidIndexException();

	}

	public int linkListLength() {
		Node<T> node = getHead();
		int cnt = 0;
		while (node != null) {
			cnt++;
			node = node.getNext();
		}
		return cnt;
	}

	public void rotateLinkListLeft(int no) throws EmptyLinkListException {
		int cnt = 0;
		while (++cnt <= no) {
			Node<T> node = getHead();
			setHead(node.getNext());
			node.setNext(null);
			getLastNode().setNext(node);
		}
	}

	public void rotateLinkListRight(int no) throws EmptyLinkListException, InvalidIndexException {
		int cnt = 0;
		while (++cnt <= no) {
			Node<T> last = getLastNode();
			Node<T> previous = getNode(linkListLength() - 1);
			last.setNext(getHead());
			this.head = last;
			previous.setNext(null);

		}
	}

	public void createLoop(T data) throws EmptyLinkListException {

		Node<T> node = getHead();
		while (node != null) {
			if (node.getData() == data) {
				getLastNode().setNext(node);
				break;
			}
			node = node.getNext();
		}

	}

	public boolean detectLoop() throws EmptyLinkListException, InvalidIndexException {
		Node<T> node1 = getHead();
		Node<T> node2 = getHead();
		while (true) {
			if (node1.getNext() == null || node2.getNext() == null) {
				return false;
			}
			node2 = node2.getNext().getNext();
			node1 = node1.getNext();

			System.out.println(node2.getData() + "NODDE2");
			System.out.println(node1.getData() + "NODDE1");
			if (node1.equals(node2)) {
				Node<T> temp = this.getNode(length);
				System.out.println(temp.getData() + "DATA");
				temp.setNext(null);
				return true;
			}
		}

	}

	public boolean compareLinkList(LinkList<T> linkList2) throws EmptyLinkListException, InvalidIndexException {
		Node<T> node1 = this.getHead();
		Node<T> node2 = linkList2.getHead();
		while (node1 != null || node2 != null) {

		}

		return false;
	}

	public boolean compare(LinkList<T> list2) throws EmptyLinkListException, InvalidIndexException {
		if (this.length != list2.length)
			return false;
		LinkList<T> temp1 = new LinkList<T>();
		Node<T> tempNode = this.getNode(1);
		while (tempNode != null) {
			temp1.insertLast((tempNode.getData()));
			tempNode = tempNode.getNext();
		}
		LinkList<T> temp2 = new LinkList<T>();
		tempNode = list2.getNode(1);
		while (tempNode != null) {
			temp2.insertLast(tempNode.getData());
			tempNode = tempNode.getNext();
		}
		temp1.sortInteger();
		temp2.sortInteger();
		tempNode = temp1.getNode(1);
		Node<T> tempnode2 = temp2.getNode(1);
		while (tempNode != null) {
			T a = (T) tempNode.getData();
			T b = (T) tempnode2.getData();
			if (!a.equals(b))
				return false;
			tempNode = tempNode.getNext();
			tempnode2 = tempnode2.getNext();
		}
		return true;
	}

	public void sortInteger() {
		Node<T> temp1 = this.head;
		while (temp1 != null) {
			Node<T> temp2 = temp1.getNext();
			while (temp2 != null) {
				if ((Integer) temp1.getData() > (Integer) temp2.getData()) {
					T data = temp1.getData();
					temp1.setData(temp2.getData());
					temp2.setData(data);
				}
				temp2 = temp2.getNext();
			}
			temp1 = temp1.getNext();
		}
	}
}
