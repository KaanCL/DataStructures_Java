
package datastructures;


public class ArrayStack {
    
   private Object[] elements;
   private int top;
   private int size;

    public ArrayStack(int size) {
       this.top = -1;
       this.size = size;
       elements = new Object[size];     
    }
    
    public void push(Object data){
         if(isFull()){
             System.out.println("Stack dolu");
             return;
         }
         top ++;
         elements[top] = data;
       
    }
    
    public Object pop(){
       if(isEmpty()){
           System.out.println("Stack bos...");
           return null;
       }
       Object temp = elements[top];
       top--;
       return temp;
        
    }
    
    
     public Object peek(){
       if(isEmpty()){
           System.out.println("Stack bos...");
           return null;
       }
       return elements[top];
        
    }
    
     public void clear(){
         top = -1;
         System.out.println("Stack bosaltildi...");
                 
     }
    
    
    public boolean isFull(){
           if(top==size-1){
            return true;
           }
           return false;
    }
    
    public boolean isEmpty(){
         if(top==-1){
         return true;
         }
         return false;
    }
    
}
