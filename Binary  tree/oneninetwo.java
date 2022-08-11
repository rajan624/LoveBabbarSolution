import java.util.ArrayList;

public class oneninetwo {
    class Node{
        int data; 
        Node left;
        Node right;
    }
    ArrayList<Integer> arr = new ArrayList<Integer>();
    void leftnode(Node node){
        if(node==null){
            return ;
        }
        if(node.left!=null){
            arr.add(node.data);
            leftnode(node.left);
        }
        else if(node.right!=null){
            arr.add(node.data);
            leftnode(node.right);
        }
    }
    void leafnode(Node node){
        if(node==null){
            return ;
        }
         leafnode(node.left);
        if(node.left==null&&node.right==null){
            arr.add(node.data);
        }
        leafnode(node.right);
    }
    void rightnode(Node node){
        if(node==null){
            return ;
        }
        if(node.right!=null){
            rightnode(node.right);
            arr.add(node.data);
        }
        else if(node.left!=null){
             rightnode(node.left);
             arr.add(node.data);
        }
        
    }
	ArrayList <Integer> printBoundary(Node node)
	{
	    if(node==null){
	        return arr;
	    }
	    arr.add(node.data);
	    leftnode(node.left);
	    leafnode(node);
	    rightnode(node.right);
	    return arr;
	}
}
