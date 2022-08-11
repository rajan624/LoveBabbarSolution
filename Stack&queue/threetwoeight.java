import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class threetwoeight {
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        Deque<Long> dq = new ArrayDeque<Long>();
        for(int i=0;i<N;i++){
            if(A[i]<0){
                dq.add(A[i]);
            }
      
         } 
         
           ArrayList<Long> arr=new ArrayList<Long>();
       
        if(dq.size()!=0){
            arr.add(dq.peek());
        }
        else{
            arr.add(0l);
        }
        int j=0;
        for(int i=K;i<N;i++){
            if(A[j]==dq.peek())
                dq.poll();
                
                j++;
            
            if(A[i]<0){
                dq.add(A[i]);
            }
            if(dq.size()!=0){
                arr.add(dq.peek());
            }
            else{
                arr.add(0l);
            }
        }
         long [] ar = new long[arr.size()];
         int index=0;
         for (Long value : arr) {
           ar[index++] = value;
            }
      
        return ar;
    }   
}
