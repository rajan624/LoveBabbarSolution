import java.util.Scanner;

public class threeseven {
    
    public static void soln(int [] arr , int a , int b){
    
        int l=0;
        int r = arr.length-1;
        int temp = 0;
        for(int i=0;i<=r;i++){
            if(arr[i]<a){
                temp = arr[i];
                arr[i] = arr[l];
                arr[l]= temp;
                l++;
            }
            else if(arr[i]>b){
                temp = arr[i];
                arr[i]  =arr[r];
                arr[r] =temp;
                r--;
                i--;
            }
        }
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
     System.out.println("enter the value of a and b");
      int a= scan.nextInt();
       int b= scan.nextInt();
       soln(arr, a, b);
       for (int i : arr) {
       System.out.println(i);
       }

    }
}
