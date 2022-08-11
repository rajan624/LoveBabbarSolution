public class twotwozero {
   class Node{
       int data; 
       Node left;
       Node right;
       
   }
    Node LCA(Node root, int n1, int n2)
	{
if(root==null){
    return null ;
}
if(root.data<n1 && root.data<n2){
   return LCA(root.left , n1 ,2);
}
else if(root.data>n1&& root.data>n2){
return    LCA(root.right , n1 ,n2);
}
else
    return root;

	}
}
