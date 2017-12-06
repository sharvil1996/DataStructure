 class CircularLinkList<T> {
	private Node<T> head;
	private int length = 0;

	public void insertBegin(T data) {
		if (this.getHead() == null){
			this.head = new Node<T>(data);
			this.head.setNext(head);
		}
		else {
			Node<T> temp = getHead();
			while(temp.getNext()!=getHead())
				temp = temp.getNext();
			Node<T> newNode = new Node<T>(data);
			temp.setNext(newNode);
			newNode.setNext(getHead());
			head = newNode;
		}
		this.length++;
	}

	@SuppressWarnings("unchecked")
	public void insertLast(T data) {
		if (this.getHead() == null){
			this.head = new Node<T>(data);
			this.head.setNext(head);
		}
		else {
			Node<T> temp = getHead();
			while(temp.getNext()!=getHead())
				temp = temp.getNext();
			Node<T> newNode = new Node<T>(data);
			temp.setNext(newNode);
			newNode.setNext(getHead());
			
		}
		this.length++;
	}

	@SuppressWarnings("unchecked")
	public void insertByPosition(T data, int position) {
		if (position == 1) 
				insertBegin(data);
		
		 else {
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

	@SuppressWarnings("unchecked")
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

	@SuppressWarnings("unchecked")
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

	@SuppressWarnings("unchecked")
	public void displayNode() {
		System.out.println();
		Node<T> temp = this.head;
		if (this.head == null)
			System.out.println("No Nodes...!");
		else {
			while (temp.getNext() != getHead()) {
				System.out.print(temp.getData() + " ");
				temp = temp.getNext();
			}
			System.out.print(temp.getData() + " ");
		}
	}

	@SuppressWarnings("unchecked")
	public boolean deleteBegin() throws EmptyLinkListException {
		if (this.head == null)
			throw new EmptyLinkListException();
		else if(this.getHead().getNext()==this.getHead())
			setHead(null);
		else {
			Node<T> temp = getHead();
			while(temp.getNext()!=getHead())
				temp = temp.getNext();

			this.head = this.head.getNext();
			temp.setNext(getHead());
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	public boolean deleteEnd() throws EmptyLinkListException {
		if (this.head == null)
			throw new EmptyLinkListException();
		else if(this.getHead().getNext()==this.getHead())
			setHead(null);
		else {
			Node<T> temp = this.head;
			Node<T> previous = null;
			while (temp.getNext() != getHead()) {
				previous = temp;
				temp = temp.getNext();
			}
			previous.setNext(head);
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	public boolean deleteByPosition(int position) throws EmptyLinkListException {
		if (position == 1) {
			deleteBegin();
			return true;
		
		}else if(position == this.length){
			deleteEnd();
			return true;
		}
		else {
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

	@SuppressWarnings("unchecked")
	public boolean deleteByValue(T data) throws EmptyLinkListException {
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

	@SuppressWarnings("unchecked")
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

	@SuppressWarnings("unchecked")
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

	@SuppressWarnings("unchecked")
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


	public void sortInteger() {
		Node<T> temp1 = this.head;
		while (temp1.getNext() != getHead()) {
			Node<T> temp2 = temp1.getNext();
			while (temp2.getNext()!= head) {
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
