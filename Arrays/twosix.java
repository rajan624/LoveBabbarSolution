import java.util.HashSet;
import java.util.Scanner;
import java.util.Set; 

public class twosix {
    public static boolean findzero( int [] arr ){
        Set<Integer> hs = new HashSet<>();
        int i =0;
        int sum=0;
        while(i<arr.length){
            sum+=arr[i];
            hs.add(sum);
            if(hs.contains(sum)||arr[i]==0||sum==0){
                return true;
            }
        }
        return false;
    }
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the number of element in the array");
    int n =scan.nextInt();
    int [] arr= new int[n];
    System.out.println("enter the element");
    for(int i=0;i<n;i++){
        arr[i]= scan.nextInt();
    }
    boolean result = findzero(arr);
    System.out.println("subarray sum is zero"+result);
    
 }   
}
