public class twotwonine {
   //Function to count number of nodes in BST that lie in the given range.
   int getCount(Node root,int low, int high)
   {
       //Your code here
       int count = 0;
if(root!=null)
{
if(root.data>=low && root.data<=high)
{
count++;
}
count += getCount(root.left,low,high);
count +=getCount(root.right,low,high);
}
return count;
   }  
}
