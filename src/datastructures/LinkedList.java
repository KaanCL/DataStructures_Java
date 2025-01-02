package datastructures;


public class LinkedList<T> {

    private Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addFirst(T data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = null;
        } else {
            newNode.next = head;
            head = newNode;

        }
        size++;
    }
    
    public T getFirst(){
       return head.data;
    }

    
    public boolean isEmpty(){
        
        if(head==null){
           return true;
        }
        else{return false;}
    
    }
    public T removeFirst() {
        
        if(head==null){
           return null;
        }else{
          T temp = head.data;
          head = head.next;
          size --;
          return temp;
        }      
    }

    public int getSize() {
        return size;
    }
    
 

    public void printList() {

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

}
