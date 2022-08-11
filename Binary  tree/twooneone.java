public class twooneone {
    class Node{
        int data;
        Node left;
        Node right;
    }
    boolean soln(Node root1, Node root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        if(root1.data!=root2.data){
            return false;
        }
        boolean a = soln(root1.left, root2.left) && soln(root1.left, root2.left);
        boolean b = soln(root1.left, root2.right) && soln(root1.right, root2.left);
        return a || b;
    }
    
}
