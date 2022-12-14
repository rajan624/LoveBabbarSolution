import java.util.Stack;

public class threeonezero {
    public Stack<Integer> sort(Stack<Integer> s)
	{
	if(s == null || s.isEmpty()) {
		    return s;
		}
		
		Stack<Integer> s1 = new Stack<>();
		Integer topS = null;
		while (!s.isEmpty()) {
		    topS = s.pop();
		    while(!s1.isEmpty() && topS < s1.peek()) {
		            s.push(s1.pop());
		    }
		    s1.push(topS);
		}
		
		return s1;
	}
}
