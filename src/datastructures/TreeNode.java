
package datastructures;

import java.util.ArrayList;
import java.util.List;


public class TreeNode {
    
    int data;
    List<TreeNode> children;

    public TreeNode(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
    
    public void addChild(TreeNode child){
        this.children.add(child);
    }
    
  
}
