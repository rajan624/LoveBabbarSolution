import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
public class oneeightseven {
   class Node{
       int data;
       Node left;
       Node right;
   }
    public ArrayList <Integer> bottomView(Node root){
        ArrayList<Integer> arr =  new ArrayList<Integer>();
        if(root==null){
            return arr;
        }
        Queue<Node> q  = new LinkedList<Node>();
        Queue<Integer> q1  = new LinkedList<Integer>();
        TreeMap<Integer , Integer> map = new TreeMap<Integer , Integer>();
        q.add(root);
        q1.add(0);
        while((!q.isEmpty())&&(!q1.isEmpty())){
            int n =q1.size();
            while(n-->0){
            int temp1 = q1.peek();
            Node temp = q.peek();
            q.poll();
            q1.poll();
            if(map.containsKey(temp1)){
                map.replace(temp1,temp.data);
            }
            else{
                map.put(temp1, temp.data);
            }
            if(temp.left!=null){
                q.add(temp.left);
                q1.add(temp1-1);
            }
            if(temp.right!=null){
                q.add(temp.right);
                q1.add(temp1+1);
            }
            }
            
        }
            for(int x : map.keySet()){
            arr.add(map.get(x));
        }
    
        return arr;
    } 
}
