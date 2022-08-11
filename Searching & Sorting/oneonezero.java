import java.util.Arrays;
import java.util.Scanner;

public class oneonezero {
    static public boolean findPair(int a[], int size, int target)
    {
        //code here.
        boolean temp =false;
        Arrays.sort(a);
            for(int i=0;i<size;i++){
                for (int j=0;j<size;j++){
                    if(i==j){
                        continue;
                    }
                    if(target==Math.abs(a[i]-a[j])){
                        temp=true;
                        break;
                    }
                }
            }
            return temp ;
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
    int target = scan.nextInt();
    System.out.println(findPair(arr, arr.length, target));
}    
}
