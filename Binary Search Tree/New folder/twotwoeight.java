import java.util.ArrayList;

public class twotwoeight {
    public static void findMedian(Node root)
    {
        // code here.
        ArrayList<Integer> al=new ArrayList<>();
inorder(root,al);
int s=al.size();
if(s%2==0){
if((al.get(s/2)+al.get((s/2)-1))%2==0){
System.out.print((al.get(s/2)+al.get((s/2)-1))/2);
}else{
System.out.print((al.get(s/2)+al.get((s/2)-1))/2.0);
}
}else{
System.out.print(al.get(s/2));
}
}
public static void inorder(Node root,ArrayList<Integer> al){
if(root!=null){
inorder(root.left,al);
al.add(root.data);
inorder(root.right,al);
}
    } 
}
