public class oneninezero {
    class Node{
        int data;
        Node left;
        Node right;
    }
    int height(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max((height(root.left)),(height(root.right)));
    }
    boolean isBalanced(Node root)
    {
	// Your code here
	if(root==null){
	    return true;
	}
	boolean lsa=isBalanced(root.left);
	if(lsa==false){
	    return false;
	}
	boolean rsa=isBalanced(root.right);
	if(rsa==false){
	    return false;
	}
	int ls= height(root.left);
	int rs=height(root.right);
	int result =Math.abs(ls-rs);
	if(result==1||result==0){
	    return true;
	}
	else {
	    return false;
	}
    } 
}
