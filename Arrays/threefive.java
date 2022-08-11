import java.util.Arrays;
import java.util.Scanner;

public class threefive {
    static int soln(int [] arr ,int m){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int n =arr.length;
        for(int i=0;i+m-1<n;i++){
            int d = arr[i+m-1]-arr[i];
            if(d<min){
                min = d;
            }
        }
        return min;

    }
    
public static void main(String[] args) {
    Scanner scan= new Scanner(System.in); 
    System.out.println("enter the number of element ");
    int n= scan.nextInt();
    int [] arr = new int[n];
    System.out.println("enter the element ");
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }
    System.out.print("enter the sum value");
    int x = scan.nextInt();
    System.out.println(soln(arr, x));
}    
}
