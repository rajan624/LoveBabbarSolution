import java.util.HashMap;

public class twozerozero {
    class Node{
        int data;
        Node left;
        Node right;
    }
    int dupSub(Node root) {

        HashMap<String,Integer> hm1 =new HashMap<String,Integer>();
        solve(root,hm1);
        for(String x1:hm1.keySet())
        {
        if(hm1.get(x1)>=2)
        {
        return 1;
        }
        }
        
        return 0;
        }
        
        String solve(Node root,HashMap<String,Integer> hm1)
        {
        if(root==null)
        {
        return "$";
        }
        String s1="";
        if(root.left==null&&root.right==null)
        {
        s1=String.valueOf(root.data);
        return s1;
        }
        s1=s1+String.valueOf(root.data);
        s1=s1+solve(root.left,hm1);
        s1=s1+solve(root.right,hm1);
        hm1.put(s1,hm1.getOrDefault(s1,0)+1);
        return s1;
        }
}
