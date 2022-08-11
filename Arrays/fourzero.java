import java.util.Arrays;
import java.util.Scanner;

public class fourzero {
    static void soln(int [] arr){
        Arrays.sort(arr);
        int n =arr.length;
        if(n%2==0){
            System.out.println("median is "+(arr[n/2]+arr[(n/2)-1])/2);
        }
        else{
            System.out.println("median is "+arr[((n+1)/2)-1]);
        }
    }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the number of element in the  first array");
    int n =scan.nextInt();
    int [] arr1= new int[n];
    System.out.println("enter the element first arry");
    for(int i=0;i<n;i++){
        arr1[i]= scan.nextInt();
    }
    soln(arr1);
  }  
}
