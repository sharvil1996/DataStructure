class DoublyLinkListNode<T>{
	private T data;
	private DoublyLinkListNode<T> prev;
	private DoublyLinkListNode<T> next;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public DoublyLinkListNode(){
			data = null;
			prev= null;
			next = null;
	}
	public DoublyLinkListNode(T data){
		this.data = data;
		this.next = null;
		this.prev= null;
	}
	public DoublyLinkListNode<T> getPrev() {
		return prev;
	}
	public void setPrev(DoublyLinkListNode<T> prev) {
		this.prev = prev;
	}
	public DoublyLinkListNode<T> getNext() {
		return next;
	}
	public void setNext(DoublyLinkListNode<T> next) {
		this.next = next;
	}
}
