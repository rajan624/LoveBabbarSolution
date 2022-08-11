public class oneninenine {
class Node{
    int data;
    Node left;
    Node right;
}   
boolean temp;
int height(Node root){
    if(root==null){
        return 0;
}
int ls = height(root.left);
int rs = height(root.right);
if(root.left!=null&&root.right!=null||ls!=rs){
    temp = false;
}
return 1+Math.max(ls, rs);
} 
boolean chk(Node root){
temp  = true;
height(root);
return temp;
}
}
