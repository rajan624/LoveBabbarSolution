public class twotwofive {
    int ans ;
        int idx=1;
        void solve(Node root , int k){
            if(root==null){
                return ;
            }
            solve(root.right, k);
            if(k==idx){
                ans = root.data;
                idx++;
                return ;
            }
            else
                idx++;
            solve(root.left,k);
        }
    public int kthLargest(Node root,int K){
    // Write your code here
          //Your code here
        
        ans=-1;
        solve(root,K);
        return ans;
    }
}
