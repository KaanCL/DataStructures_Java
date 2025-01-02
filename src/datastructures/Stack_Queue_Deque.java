
package datastructures;


public class Stack_Queue_Deque {
    public static void main(String[] args) {

       Tree agac = new Tree(15);
       TreeNode root = agac.root;
       
       agac.addNode(root, 2);
       agac.addNode(root, 3);
       
       
       TreeNode node2 = root.children.get(0);
       agac.addNode(node2, 1);
       agac.addNode(node2, 5);
       
       TreeNode node3 = root.children.get(1);
        agac.addNode(node3, 3);
       agac.addNode(node3, 1);
       
       
       agac.printTree(root, "");
       
       
     
    }
    


    
}
