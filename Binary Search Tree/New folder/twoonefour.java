public class twoonefour{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int value){
            data=value;
            left=null;
            right=null;
        }
    }
    Node findNode(Node root , int value){
        if(root==null || root.data==value){
            return root;
        }
        if(root.data>value){
            return findNode(root.left, value);
        }
        else{
            return findNode(root.right, value);
        }
    }
    Node insetNode(Node root , int value){
        if(root==null){
            Node x = new Node(value);
            return x;
        }
        if(root.data>value){
            root.left= findNode(root.left, value);
    }
    else{
        root.right =findNode(root.right, value);
        
    }
    return root;
    }
}