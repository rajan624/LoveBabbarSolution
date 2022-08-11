import java.util.Stack;

public class threeonetwo {
    public static long getMaxArea(long a[], long n) 
    {
        // your code here
        Stack<Long> st =new Stack<Long>();
        st.add(0l);
        long ans =0;
    long i =0;
    while(i<n){
        while(st.empty() &&| a[(int)st.peek()] <= a[(int)i]){
            long t = st.pop();
            long h = a[(int)t];
            st.pop();
            if(st.empty()){
                ans = Math.max(ans,h*i);
            }
            else{
                long len = i - st.top() - 1l;
                ans = Math.max(ans,h*len);
            }
            
        }
        i++;
        st.add(i);
    }
    return ans;
    }  
}
