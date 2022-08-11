import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class oneeighteight{
    class Node{
        int data;
        Node right;
        Node left;
    }
    static void levelorder(Node root, TreeMap<Integer , Integer> map){
        Queue<Node> q = new LinkedList<Node>();
                Queue<Integer> q1 = new LinkedList<Integer>();
                q.add(root);
                q1.add(0);
                while((!q.isEmpty())&&(!q1.isEmpty())){
                    int temp1 = q1.peek();
                    Node temp= q.peek();
                   q.poll();
                    q1.poll();
                    if(!map.containsKey(temp1)){
                        map.put(temp1,temp.data);
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
                return ;
    }
    static ArrayList<Integer> topView(Node root){
        TreeMap<Integer , Integer> map = new TreeMap<Integer , Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        levelorder(root, map);
        for(int x: map.keySet()){
        arr.add(map.get(x));
        }
        return arr;
        
        
    }
}
