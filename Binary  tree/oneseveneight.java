import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class oneseveneight {
    class Node{
        int data;
        Node left;
        Node right;
    }
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
         ArrayList<Integer> arr = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node temp = q.peek();
           
             if(temp.right!=null){
                q.add(temp.right);
            }
            if(temp.left!=null){
                q.add(temp.left);
            }
        
            q.poll();
            arr.add(temp.data);
        }
        
       Collections.reverse(arr);
          return arr;
        } 
}
