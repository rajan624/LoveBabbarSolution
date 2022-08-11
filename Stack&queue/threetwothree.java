import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class threetwothree {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
      //add code here.
      int len = q.size();
Stack<Integer> stack = new Stack<>();
Queue<Integer> qq = new LinkedList<>();
for(int i = 0; i < k; i++){
stack.push(q.remove());
}
for(int i = k; i < len; i++){
qq.add(q.remove());
}
while(!stack.empty()){
q.add(stack.pop());
}
q.addAll(qq);
return q;
    }
}
