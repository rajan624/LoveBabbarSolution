public class oneeightzero {
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
static int diameter(Node root){
    if(root==null){
        return 0;
    }
    Node tmep = root;
    int lh =soln(tmep.left)+soln(tmep.right)+1;
    int rh = diameter(root.left);
    int rha = diameter(root.right);
    return Math.max(Math.max(rh, rha),lh);
}
}
