import java.util.ArrayList;
import java.util.Collections;

public class twotwotwo {
    Node head = null;
    int i =0;
ArrayList<Integer> arr = new ArrayList<Integer>();

void inorder(Node root){
   if(root==null){
       return ;
   }
   inorder(root.left);
   arr.add(root.data);
   inorder(root.right);
}
void set(Node root){
   if(root==null){
       return ;
   }
   set(root.left);
   root.data = arr.get(i);
   i++;
   set(root.right);
}

Node binaryTreeToBST(Node root)
{
  // Your code here
  inorder(root);
  Collections.sort(arr);
  set(root);
  return root;
}
}
