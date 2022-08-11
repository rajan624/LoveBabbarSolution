public class oneninefour {
   class Node{
       int data;
       Node left;
       Node right;
   } 
   Node head;
       Node prev = null;
   Node btdll(Node root){ 
       if(root==null){
           return head;
       }
       btdll(root.left);
       if(prev==null){
           head = root;
       }
       else{
           root.left= prev;
           prev.right=root;
       }
       prev= root;
       btdll(root.right);
       return head;
   }
}
