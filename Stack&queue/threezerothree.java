import java.util.Stack;

public class threezerothree {
    Stack<Integer> st = new Stack<>();
	public void push(int a,Stack<Integer> s){
	    s.push(a);
	    if(st.isEmpty()){
	        st.push(a);
	    }
	    else{
	        if(st.peek()>a){
	            st.push(a);
	        }
	    }
	}
	public int pop(Stack<Integer> s){
            int g= s.pop();
            if(st.peek()==g){
                st.pop();
            }
            return g;
	}
	public int min(Stack<Integer> s){
           //add code here.
           return st.peek();
	}
	public boolean isFull(Stack<Integer>s, int n){
           //add code here.
           if(s.size()==n){
               return true;
           }
           else{
               return false;
           }
	}
    public boolean isEmpty(Stack<Integer>s){
           if(s.isEmpty()){
               return true;
           }
           else{
               return false;
           }
	}
    
}
