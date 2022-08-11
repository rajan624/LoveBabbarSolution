import java.util.Scanner;

public class fourteen {
    public static int maxmin(int [] arr ,int k){
        int max;
        int  min;
        int n= arr.length;
        int result=arr[n-1]-arr[0];
      for(int i=1;i<n;i++){
             if(arr[i]>k){
                 max= Math.max(arr[i-1]+k, arr[n-1]-k);
                 min = Math.min(arr[0]+k,arr[i]-k);
                 result= Math.min(result, max-min);
             }
        }
        return result;
    }
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the number of element in the array");
    int n =scan.nextInt();
    int [] arr= new int[n];
    System.out.println("enter the element contigous subarry");
    for(int i=0;i<n;i++){
        arr[i]= scan.nextInt();
    }
    System.out.println("enter the kth element :");
    int k = scan.nextInt();
    int result = maxmin(arr, k);
    System.out.print(result);
 }   
}
