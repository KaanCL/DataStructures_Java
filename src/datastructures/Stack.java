
package datastructures;

import java.util.ArrayList;



/*
Push(item)
Pop()
ShowLast()
Size()
isEmpty()
*/

public class Stack<T> {
    private LinkedList<T> elements;
 

    public Stack() {
        
        elements = new LinkedList();  
    }
    
    public void Push(T value){
        elements.addFirst(value);
       
    }
    
    public T Pop(){
    return elements.removeFirst();  
    }
    
     public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.getFirst(); 
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }


    public int size() {
        return elements.getSize();
    }
    
    
}

 
        
