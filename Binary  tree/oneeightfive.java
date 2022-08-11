import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class oneeightfive {
    class Node{
        int data;
        Node left;
        Node right;
    }
 static ArrayList<Integer> soln(Node root){
     ArrayList<Integer> arr = new ArrayList<>();
     if(root==null){
         return arr;
     }
     Queue<Node> q = new LinkedList<Node>();
     q.add(root);
     while(!q.isEmpty()){
         int n = q.size();
        
         for(int i =0;i<n;i++){
            Node temp = q.peek();
             if(i==0){
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
