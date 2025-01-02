
package datastructures;

/*
enQueue()
deQueue()
size()
isEmpty()
*/
//first in firts out
public class Queue {
    
    private Object[] elements;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
        head = 0;
        tail = -1;
        size = 0;
    
    }
    
    public void enQueue(Object data){
        
        if(isFull()){
            System.out.println("Queue dolu ...");
        }
        
        tail = (tail + 1);
        elements[tail] = data;
        size ++;
    
    }
    
    public Object deQueue(){
        if(isEmpty()){
           System.out.println("Queue bos ...");
        }  
        
        Object item = elements[head];
        elements[head] = null;
        head = (head + 1);
        size--;
        return item;      
    }
    
    
    
    public boolean isEmpty(){
       return size == 0;
    }
    
    public boolean isFull(){
       return (capacity == size);
    }
    
    
    public void printQueue(){
        for (Object element : elements) {
            System.out.println(element);
                    
        }
    }
    
  
    
    
    
}
