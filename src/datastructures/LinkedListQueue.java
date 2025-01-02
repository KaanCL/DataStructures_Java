
package datastructures;


/*
enQueue()
deQueue()
size()
isEmpty()
*/


public class LinkedListQueue {
    
   private Node head;
   private Node tail;
   private int size;

    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
        size = 0;
    }
    
  
    public void enQueue(Object data){
    
        Node yeniNode = new Node(data);
        
        if(isEmpty()){
          head = yeniNode;
          tail = yeniNode;
        }else{
            tail.next= yeniNode;
            tail = yeniNode;    
                 
        }
    
        size++;
    }
    
    public Object deQueue(){
       
        if(isEmpty()){
            System.out.println("Queue bos...");
            return null;
        }else{
            Object temp = head.data;
            head = head.next;      
            return temp;
            
        }
        
    }
    
    
    public boolean isEmpty(){
        return (head==null); 
    }
    
    public void printList(){
    
        Node temp = head;
        
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    
    }
   
    
    
    
   
    
    
}
