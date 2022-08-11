import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class oneeightnine {
    class Node{
        int data;
        Node right;
        Node left;
    }
    ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    Stack<Integer> st = new Stack<Integer>();
	    Queue<Node>  q = new LinkedList<Node>();
	    boolean bol=true;
	    q.add(root);
	    while(!q.isEmpty()){
	        int n = q.size();
	        for(int i =0;i<n;i++){
	            Node temp = q.poll();
	            if(bol){
	                arr.add(temp.data);
	            }
	            else{
	                st.add(temp.data);
	            }
	            if(temp.left!=null){
	                q.add(temp.left);
	            }
	            if(temp.right!=null){
	                q.add(temp.right);
	            }
	        }
	        while(!st.isEmpty()){
	            arr.add(st.pop());
	        }
	        bol=!bol;
	    }
	    return arr;
	 }
}
