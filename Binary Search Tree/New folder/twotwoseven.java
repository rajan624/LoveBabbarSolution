public class twotwoseven {
    static    int count;
static    boolean fetch(Node root2, int k){
        if(root2==null){
            return false;
        }
        if(root2.data==k){
            return true;
        }
        boolean x = false;
        boolean y= false;
        if(root2.data>k){
         x = fetch(root2.left,k);
        }
        else if(root2.data<k){
         y = fetch(root2.right,k);
    }
    return x || y;
    }
   static void solve(Node root1 , Node root2, int x){
        if(root1==null){
            return ;
        }
        solve(root1.left, root2,x);
        if(fetch(root2,x-root1.data)){
            count++;
        }
        solve(root1.right,root2,x);
    }
    public static int countPairs(Node root1, Node root2, int x)
    {
        if(root1==null){
            return 0;
        }
        if(root2==null){
            return 0;
        }
        count =0;
    solve(root1,root2,x);
    return count;
    
    }
}
