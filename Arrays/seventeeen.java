import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class seventeeen {
    public static void mergesarray(int [] arr1 , int [] arr2){
          int i=0;
          int temp =0;
          int m= arr1.length-1;
          while(i<arr2.length-1&&m>-1&&arr1[m]>arr2[i]){
              temp = arr1[m];
              arr1[m] = arr2[i];
              arr2[i] =temp;
              i++;
              m--;
          }
          Arrays.sort(arr1);
          Arrays.sort(arr2); 
          for (int l : arr1) {
              System.out.print(" "+l);
          }
          for (int j : arr2) {
          System.out.print(" "+j);
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
    System.out.println("enter the number of element in the  second array");
    int m =scan.nextInt();
    int [] arr2= new int[m];
    System.out.println("enter the element second arry");
    for(int i=0;i<m;i++){
        arr2[i]= scan.nextInt();
    }
mergesarray(arr1, arr2);

}    
}
