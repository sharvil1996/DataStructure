public class LinkList<T>{
  private Node<T> head;
  public void insertBegin(T data){
      if(this.head == null)
          this.head = new Node<T>(data);
      else{
        Node<T> temp = new Node<T>(data);
        temp.setNext(this.head);
        this.head = temp;
      }
  }
  public void insertLast(T data){
      if(this.head == null)
          this.head = new Node<T>(data);
      else{
        Node<T> temp = this.head;
        while(temp.getNext() != null)
            temp = temp.getNext();
        temp.setNext(new Node<T>(data));
      }
  }
  public void insertByPosition(T data,int position){
    if(position == 1){
      if(this.head == null)
        this.head = new Node<T>(data);
      else
        insertBegin(data);
    }
    else{
      int cnt = 1;
      Node<T> temp = this.head;
      Node<T> previous = null;
      while(temp!=null){
        if(position == cnt)
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
  public boolean insertByBeforeValue(T key,T data){
    Node<T> temp = this.head;
    Node<T> previous = null;
    if(head.getData() == key){
      insertBegin(data);
      return true;
    }
    while(temp!=null){
      if(temp.getData() == key){
        Node<T> newNode = new Node<T>(data);
        System.out.println(temp.getData()  + " KEY");
        System.out.println(previous.getData()  + " KEY");
        previous.setNext(newNode);
        newNode.setNext(temp);
        return true;
      }
      previous = temp;
      temp = temp.getNext();
    }
    return false;
  }
  public boolean insertByAfterValue(T key,T data){
    Node<T> temp = this.head;
    while(temp!=null){
     if(temp.getData() == key){
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        return true;
      }
      temp = temp.getNext();
    }
    return false;
  }
  public void displayNode(){
    System.out.println();
    Node<T> temp = this.head;
    if(this.head == null)
      System.out.println("No Nodes...!");
    else{
      while(temp!=null){
        System.out.print(temp.getData() + " ");
        temp = temp.getNext();
      }
    }
  }
  public boolean deleteBegin(){
    if(this.head == null)
      return false;
    else{
      this.head = this.head.getNext();
      return true;
    }
  }
  public boolean deleteEnd(){
    if(this.head == null)
      return false;
    else if(this.head.getNext() == null){
      this.head = null;
      return true;
    }
    else{
      Node<T> temp = this.head;
      Node<T> previous = null;
      while(temp.getNext()!=null){
        previous = temp;
        temp = temp.getNext();
      }
      previous.setNext(null);
      return true;
    }
  }
  public boolean deleteByPosition(int position){
      if(position ==1){
        deleteBegin();
        return true;
      }
      else{
        int cnt = 1;
        Node<T> temp = this.head;
        Node<T> previous = null;
        while(temp!=null){
        if(cnt == position){
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
  public boolean deleteByValue(T data){
    if(this.head.getData() == data){
      deleteBegin();
      return true;
    }
    else{
      Node<T> temp = this.head;
      Node<T> previous = null;
      while(temp!=null){
        if(temp.getData() == data){
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
}
