public class twozeroseven {
    class Node{
        int data;
        Node left;
        Node right;
    }
    Node lca(Node root, int n1,int n2){
		// Your code here
		if(root==null){
		    return null;
		}
		if(root.data==n1 || root.data==n2){
		    return root;
		}
		Node lr = lca(root.left, n1, n2);
		Node rr = lca(root.right, n1, n2);
		if(lr!=null && rr != null){
		    return root;
		}
		if(lr!=null){
		    return lr;
		}
		else{
		    return rr;
		}
	} 
}
