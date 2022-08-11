import java.util.Scanner;

public class oneonesix {
    public static long[] productExceptSelf(int arr[], int n) 
	{ 
    
    long [] l = new long[n];
    l[0]=1;
    long [] r = new long[n];
    r[n-1]=1;
    long [] res = new long[n];
          for(int i=1;i<n;i++){
              l[i]=l[i-1]*(long)arr[i-1];
          }
          for(int i=n-2;i>=0;i--){
              r[i]=r[i+1]*(long)arr[i+1];
          }
          for(int i=0;i<n;i++){
              res[i]=l[i]*r[i];
          }
          return res;
	} 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of integers ");
     int n1 = scan.nextInt();
     System.out.println("entter the element ");
     int [] arr1 = new int [n1];
     for(int i =0;i<n1;i++){
         arr1[i] = scan.nextInt();
        }
        System.out.println("your soln is that "+productExceptSelf(arr1, n1));
    }
}
