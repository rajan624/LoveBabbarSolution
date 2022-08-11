import java.util.Scanner;
import java.util.Stack;

public class threezerotwo {
   static public String reverse(String S){
        //code here
        String k="";
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }
        while(!st.isEmpty()){
            k+=st.pop();
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(reverse(s));
    }   
    
}
