public class twothreethree {
    static    boolean soln(Node root,int min, int max){
        if(root==null){
            return false;
        }
        if(min==max){
            return true;
        }
        return (soln(root.left,min,root.data-1)||soln(root.right, root.data+1,max));
    }
    public static boolean isDeadEnd(Node root)
    {
        return (soln(root,1,Integer.MAX_VALUE));
    }  
}
