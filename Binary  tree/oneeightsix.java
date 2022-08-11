import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class oneeightsix {
    class Node{
        int data;
        Node left;
        Node right;
    }
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(node==null){
            return arr;
        }
        Queue<Node> q= new LinkedList<Node>();
        q.add(node);
        while(!q.isEmpty()){
            int n= q.size();
            for(int i=0;i<n;i++){
                Node temp =q.poll();
                if(i==n-1){
                    arr.add(temp.data);
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
        return arr;
    }   
}
