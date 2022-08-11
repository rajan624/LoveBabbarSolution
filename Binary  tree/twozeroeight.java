public class twozeroeight {
    class Node{
        int data;
        Node left;
        Node right;
    }
    Node lca(Node root , int a , int b){
        if(root==null){
            return null;
        }
        if(root.data==a||root.data==b){
            return root;
        }
        Node lr = lca(root.left, a, b);
        Node rr = lca(root.right, a, b);
        if(lr!=null && rr!=null){
            return root;
        }
        if(lr!=null){
            return lr;
        }
        else{
           return rr;
        }
    }
    int height(Node root , int a){
        if(root==null){
            return 0;
        }
        if(root.data==a){
             return 1;
        }
        int lr = height(root.left, a);
        int rr = height(root.right, a);
        if(lr==0 && rr==0){
            return 0;
        }
        else{
            return lr+r+1;
        }
    }
    int finddistance(Node root , int a , int b){
        if(root==null){
            return 0;
        }
        Node lc = lca(root, a, b);
        int rr = height(lc , a );
        int lr = height(lc , b);
        return rr+lr-2;
    }
}
