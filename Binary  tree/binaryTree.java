import java.util.Scanner;

public class binaryTree {
    class Node {
        int data;
        Node left;
    Node right;
    Node(int data){
        this.left=null;
        this.right=null;
    }
    }
       public void insert(Node node, int value) {
            if (value < node.data){ 
                if (node.left != null){ 
                    insert(node.left, value); 
                } else { 
                    System.out.println(" Inserted " + value + " to left of " + node.data); 
                    node.left = new Node(value); 
                } 
            }
                     
            else if (value > node.data) {
              if (node.right != null) {
                insert(node.right, value);
              } else {
                System.out.println("  Inserted " + value + " to right of "+ node.data);
                node.right = new Node(value);
              }
            }
          }
         public void traverseInOrder(Node node) {
            if (node != null) {
                traverseInOrder(node.left);
                System.out.print(" " + node.data);
                traverseInOrder(node.right);
            }
         }
         
         public static void main(String args[]){
             Scanner scan = new Scanner(System.in);
        binaryTree tree = new binaryTree();
                    Node root = new Node(5);
                    System.out.println("Binary Tree Example");
                    System.out.println("Building tree with root value " + root.data);
                    tree.insert(root, 2);
                    tree.insert(root, 4);
                    tree.insert(root, 8);
                    tree.insert(root, 6);
                    tree.insert(root, 7);
                    tree.insert(root, 3);
                    tree.insert(root, 9);
                    System.out.println("Traversing tree in order");
                    
                  }
    
    }