import java.util.Stack;

public class oneeightthree {
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
     
        // Recursive function to perform preorder traversal on the tree
        public static void preorder(Node root)
        {
            // return if the current node is empty
            if (root == null) {
                return;
            }
        
            // Display the data part of the root (or current node)
            System.out.print(root.data + " ");
        
            // Traverse the left subtree
            preorder(root.left);
        
            // Traverse the right subtree
            preorder(root.right);
        }    
        public static void preorderIterative(Node root)
        {
            // return if the tree is empty
            if (root == null) {
                return;
            }
        
            // create an empty stack and push the root node
            Stack<Node> stack = new Stack();
            stack.push(root);
        
            // loop till stack is empty
            while (!stack.empty())
            {
                // pop a node from the stack and print it
                Node curr = stack.pop();
        
                System.out.print(curr.data + " ");
        
                // push the right child of the popped node into the stack
                if (curr.right != null) {
                    stack.push(curr.right);
                }
        
                // push the left child of the popped node into the stack
                if (curr.left != null) {
                    stack.push(curr.left);
                }
        
                // the right child must be pushed first so that the left child
                // is processed first (LIFO order)
            }
        }
}
