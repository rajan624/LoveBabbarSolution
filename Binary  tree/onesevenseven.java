import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class onesevenseven{
    class Node{
        int data;
        Node left;
        Node right;
    }
    static ArrayList<Integer> soln(Node root ){
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Node> q = new LinkedList<Node>();
         q.add(root);
         while(!q.isEmpty()){
              Node temp = q.peek();
              if(temp.left!=null){
                  q.add(temp.left);
              }
              if(temp.right!=null){
                  q.add(temp.right);
              }
              q.poll();
              arr.add(temp.data);
         }
         return arr;
    }
}