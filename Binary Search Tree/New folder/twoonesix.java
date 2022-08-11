public class twoonesix {

     //Function to find the minimum element in the given BST.
     class Node{
         int data;
         Node left;
         Node right;
     }
     int minValue(Node node)
     {
         if(node.left!=null){
             return minValue(node.left);
         }
         else{
             return node.data;
         }
         
     }
}
