import java.util.ArrayList;

public class twotwothree {
     class Node{
         int data;
         Node left;
         Node right;
     }
     ArrayList<Node> arr = new  ArrayList<>();
     int start =0;
     int end = arr.size();
     void inorder(Node root){
         if(root==null){
             return ;
     }
     inorder(root.left);
     arr.add(root);
     inorder(root.right);
     }
Node soln(int start , int end){
         if(start>end){
             return null ;
         }
         int mid = (start+end)/2;
         Node root = arr.get(mid);
        root.left= soln(start,mid-1);
        root.right= soln(mid+1 , end);
         return root;
     }
     Node bst(Node root){
         inorder(root);
        root =soln(start, end);
         return root;
     }
}
