import java.util.ArrayList;

public class twotwofour {
    class Node{
        int data;
        Node left;
        Node right;
    }
    ArrayList<Node> arr = new  ArrayList<>();
    void inorder(Node root){
        if(root==null){
            return ;
    }
    inorder(root.left);
    arr.add(root);
    inorder(root.right);
    }
    ArrayList<Node> arr1 = new  ArrayList<>();
    void inorder1(Node root1){
        if(root1==null){
            return ;
    }
    inorder(root1.left);
    arr1.add(root1);
    inorder(root1.right);
    }
    public static void merge(ArrayList<Integer> arr, ArrayList<Integer> arr1) {
        for (int index1 = 0, index2 = 0; index2 < arr1.size(); index1++) {
            if (index1 == arr.size() || arr.get(index1) > arr1.get(index2)) {
                arr.add(index1, arr1.get(index2++));
            }
        }
    }
    int start =0;
    int end = arr.size(); 
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
    Node mergebst(Node root){
        inorder(root);
       root =soln(start, end);
        return root;
    }
}
