import java.util.Scanner;

public class threesix {
    public static int soln(int [] arr , int x){
      int mi = Integer.MAX_VALUE;
      int i=0;
      int j=0;
      int s=0;
      int n = arr.length;
      while(i<=j && j<n){
          while(s<=x && j<n){
              s+=arr[j++];
          }
          while(s>x && i<j){
              mi =Math.min(mi, j-i);
              s-=arr[i];
              i++;
          }
      }
      return mi;  
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
