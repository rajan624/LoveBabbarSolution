public class twooneeight {
   class Node{
       int data;
       Node left;
       Node right;
   }
    boolean flag =true;
    Node prev = null;
   void chk(Node root){
       if(root==null){
           return ;
       }
       chk(root.left);
       if(prev!=null && root.data<=prev.data){
           flag=false;
           return ;
       }
       prev = root;
       chk(root.right);
       
   }
  boolean isBST(Node root)
  {
      // code here.
      chk(root);
      return flag;
  }
}
