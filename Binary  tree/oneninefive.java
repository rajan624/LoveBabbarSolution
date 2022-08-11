public class oneninefive {
    class Node{
        int data;
        Node left;
        Node right;
    }
    int soln(Node root){
        if(root==null){
        return 0;
        }
        int a = soln(root.left);
        int b = soln(root.right);
        int x = root.data;
        root.data= a+b;
        return a+b+x;
    }
    public void sumtree(Node root){
        soln(root);
    }
}
