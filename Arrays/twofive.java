
import java.util.Scanner;

public class twofive{
    public static void soln(int [] arr){
        int i=0;
        int temp;
        int n=arr.length-1;
        while(i<=n){
            if(arr[i]>=0){
                i++;
            }
             else if(arr[n]<0){
                n--;
            }
            else if(arr[i]<0&&arr[n]>=0){
                temp= arr[i];
                arr[i] =arr[n];
                arr[n]=temp;
            }
        }
        int k=0;
        while(i<arr.length){
            temp =arr[i];
            arr[i] = arr[k];
            arr[k] =temp;
            i++;
            k+=2; 
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
soln(arr);
 for (int j : arr) {
            System.out.print(" "+j);

        }
}    
}
