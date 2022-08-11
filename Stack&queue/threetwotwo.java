import java.util.Queue;

public class threetwotwo {
public static Queue<Integer>  soln(Queue<Integer> q){
    if(!q.isEmpty()){
        return q;
    }
    int temp = q.peek();
    q.poll();
    q=soln(q);
    q.add(temp);
    return q;

}    
}
