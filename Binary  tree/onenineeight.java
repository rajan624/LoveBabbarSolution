public class onenineeight {
    class Node{
        int data;
        Node left;
        Node right;
    }
    boolean temp ;
    int res(Node root){
       if(root==null){
       return 0;
       }
       if(root.left!=null&&root.right!=null){
           return root.data;
       }
       if(temp){
           return 0;
       }
       int a = res(root.left);
       int b = res(root.right);
       if(root.data!=a+b){
           temp= false;
       }
       return a+b+root.data;

    }
    public boolean soln(Node root){
        temp =true;
        res(root);
        return temp;
    }
    
}
