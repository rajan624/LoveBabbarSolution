import java.util.Scanner;
import java.util.Stack;

public class threezeroone {
    static boolean ispar(String s)
    {
        // add your code here

Stack<Character> stack = new Stack<Character>();
for (char c : s.toCharArray()) {
if (c == '(')
stack.push(')');
else if (c == '{')
stack.push('}');
else if (c == '[')
stack.push(']');
else if (stack.isEmpty() || stack.pop() != c)
return false;
}
return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(ispar(s));
    }   
}
