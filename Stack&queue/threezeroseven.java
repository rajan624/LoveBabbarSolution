import java.util.Scanner;
import java.util.Stack;

public class threezeroseven {
    static int soln(String S){
    int REDIX=10;
    Stack<Integer> st = new Stack<>();
    for(int i=0;i<S.length();i++){
      
        if(S.charAt(i)=='*'){
            int y=(st.pop());
            int x=(st.pop());
            int r =x*y;
            st.push(r);
        }
        else if(S.charAt(i)=='/'){
            int y=(st.pop());
            int x=(st.pop());
            int r= x/y;    
            st.push(r);
        }
        else if(S.charAt(i)=='+'){
            int y=(st.pop());
            int x=(st.pop());
            int k= x+y;
            st.push(k);
        }
        else if(S.charAt(i)=='-'){
            int y=(st.pop());
            int x=(st.pop());
            int r = x-y;
            st.push(r);
        }
        else{
             st.push((Character.getNumericValue(S.charAt(i))));
        }
    }
    return st.pop();
}
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s  = scan.next();
    System.out.println(soln(s));
}    
}
