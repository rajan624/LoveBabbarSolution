public class twoonefive {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    int maxNode(TreeNode node){
        if(node.right!=null){
            return maxNode(node.right);
            }
            else{
                return node.val;
            }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(key>root.val){
            root.right= deleteNode( root.right, key);
        }
        else if (root.val>key){
            root.left = deleteNode( root.left , key);
            }
        else{
            if(root.left!=null && root.right!=null){
                int max = maxNode( root.left);
                root.val = max;
                root.left = deleteNode(root.left, max);
                return root;
            }
            else if(root.left!=null){
               return  root.left;
            }
            else if(root.right!=null){
                return root.right;
            }
            else{
                return null;
            }
        }
        return root;
    }
}
