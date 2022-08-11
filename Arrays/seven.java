import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Scanner;

public class seven {
    public static int soln(int [] arr,int k){
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
            for(int i=0;i<arr.length;i++){
                pq.add(arr[i]);
            }
            while(k!=1){
                pq.poll();
                k--;
            }
        return pq.peek();    

    }

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the number of element in the array");
    int n =scan.nextInt();
    int [] arr= new int[n];
    System.out.print("enter the element");
    for(int i=0;i<n;i++){
        arr[i]= scan.nextInt();
    }
    System.out.println("enter the kth number");
    int k =scan.nextInt();
    int result = soln(arr, k);
    System.out.println("result is " +result);

}    
}
