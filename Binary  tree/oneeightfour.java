public class oneeightfour {
    class Node
    {
        int data;
        Node left, right;
     
        // Function to create a new binary tree node having a given key
        public Node(int key)
        {
            data = key;
            left = right = null;
        }
    }
     
    
        // Recursive function to perform postorder traversal on the tree
        public static void postorder(Node root)
        {
            // return if the current node is empty
            if (root == null) {
                return;
            }
        
            // Traverse the left subtree
            postorder(root.left);
        
            // Traverse the right subtree
            postorder(root.right);
        
            // Display the data part of the root (or current node)
            System.out.print(root.data + " ");
        } 
}
