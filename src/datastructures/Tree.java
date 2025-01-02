
package datastructures;


public class Tree {
    
   TreeNode root;
    
    public Tree(int rootData){
        this.root = new TreeNode(rootData);
    }
    
    public void addNode(TreeNode parent,int childData){
        TreeNode child = new TreeNode(childData);
        parent.addChild(child);
    }
    
    public void printTree(TreeNode node,String prefix){
        
        if(node == null){
           return;
        }
        
        System.out.println(prefix + node.data);
        for(TreeNode child : node.children){
          printTree(child, prefix + "  ");
        }
    
    }
    
     
    
}
