import java.util.Scanner;
import java.util.Stack;

public class sevensix {
   static int countRev (String s)
    {
        // your code here    
        Stack<Character> st = new Stack<Character>();
        int os=0;
        int cs=0;
        if(s.length()%2!=0){
            return -1;
        }
        else{
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'){
                st.add('{');
                cs++;
            }
            else if(s.charAt(i)=='}'&&!st.isEmpty()&&st.peek()=='{'){
                st.pop();
                cs--;
            }
            else{
                os++;
            }
        }
        }
        if(cs%2!=0){
            cs=(cs/2)+1;
        }
        else{
            cs=cs/2;
        }
        if(os%2!=0){
            os=(os/2)+1;
        }
        else{
            os=os/2;
        }
        return os+cs;
    }
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the string ");
    String s = scan.nextLine();
    System.out.println(countRev(s));
 }   
}
