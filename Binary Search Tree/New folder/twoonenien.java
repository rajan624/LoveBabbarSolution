public class twoonenien {
    class Node{
        int data;
        Node left;
        Node right;
        Node next;
    }
    Node prev = null;
    public void populateNext(Node root){
        //code here
        if(root == null){
            return ;
        }
        populateNext(root.left);
        if(prev!=null){
            prev.next = root;
        }
        prev = root;
        populateNext(root.right);
    }   
}
