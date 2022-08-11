public class onesevennine {
    class Node{
        int data;
        Node left;
        Node right;
    }
static int soln(Node root){
            if(root==null){
                return 0;
            }
            int lh = soln(root.left);
            int rh = soln(root.right);
            return 1+Math.max(lh, rh);

}    
}
