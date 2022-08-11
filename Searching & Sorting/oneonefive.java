import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class oneonefive {
    public static long findSubarray(long[] A ,int N) 
    {
    long preSUM = 0, zeroSUM = 0;
    Map<Long,Integer> map = new HashMap<>();
    for (int i=0; i < N; i++)
    {
        preSUM += A[i];
        if (preSUM == 0) ++zeroSUM;
        if (map.containsKey(preSUM))
            zeroSUM += map.get(preSUM);
        map.put(preSUM , map.getOrDefault(preSUM,0)+1);
    }
    return zeroSUM;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of integers ");
     int n1 = scan.nextInt();
     System.out.println("entter the element ");
     long [] arr1 = new long [n1];
     for(int i =0;i<n1;i++){
         arr1[i] = scan.nextLong();
        }
        System.out.println("your soln is that "+findSubarray(arr1, n1));
    }
}
