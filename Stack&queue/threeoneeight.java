import java.util.Stack;

public class threeoneeight {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   // Your code here
	   s1.push(x);
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   // Your code here
	   if(s2.empty()){
            if(s1.empty()){
                return -1;
            }
            else{
                while(!s1.empty()){ 
                    s2.push(s1.pop());
                }
                
                return  s2.pop();
            }
        }
        // S2 is not empty so just pop out element from it
        else{
            return s2.pop();
        }
    }
}
