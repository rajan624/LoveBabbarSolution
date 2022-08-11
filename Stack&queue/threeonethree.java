import java.util.Stack;

public class threeonethree {
    //method one m
    static int findMaxLen(String S) {
        // code here
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int ans =0;
        for(int i =0;i<S.length();++i){
            if(S.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.size()==0){
                    st.push(i);
                }
                else{
                    ans = Math.max(ans,i-st.peek());
                }
            }
        }
        return ans;
    }
    static int findMaxLefn(String S) {
        // code here
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int ans =0;
        for(int i =0;i<S.length();++i){
            if(S.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.size()==0){
                    st.push(i);
                }
                else{
                    ans = Math.max(ans,i-st.peek());
                }
            }
        }
        return ans;
    }
}
