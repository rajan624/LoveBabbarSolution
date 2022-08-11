import java.util.Arrays;
import java.util.Scanner;

public class oneonethree {
    static long soln(int [] arr,int sum){
        int n = arr.length;
        Arrays.sort(arr);
        long c=0;
        for(int k =0;k<n-2;k++){
            int i=k+1;
            int  j =n-1;
            while(i<j){
                if(arr[i]+arr[j]+arr[k]>=sum){
                    j--;
                }
                else{
                   
                    c+=(j-i);
                     i++;
                }
            }
        }
        return c;
    }
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("enter the number of integers ");
    int n = scan.nextInt();
    System.out.println("entter the element ");
    int [] arr = new int [n];
    for(int i =0;i<n;i++){
        arr[i] = scan.nextInt();
    }
    System.out.println("enter the sum ");
    int sum = scan.nextInt();
    System.out.println("your answer is that "+soln(arr,sum));
   } 
}
