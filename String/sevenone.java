import java.util.Scanner;
import java.util.Stack;

public class sevenone {
    static boolean soln(String s){
        Stack<Character> st = new Stack<>();
        char [] arr = s.toCharArray();
        for (char c : arr) {
            if(c=='('){
                st.add(')');
            }
            else if(c=='['){
                st.add(']');
            }
            else if(c=='{'){
                st.add('}');
            }
            else if(st.isEmpty()||st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty();
    }
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the string ");
    String s = scan.next();
    System.out.println(soln(s));
}    
}
