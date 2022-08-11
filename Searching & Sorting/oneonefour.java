import java.util.Arrays;
import java.util.Scanner;

public class oneonefour {
    static void soln(int []arr1,int []arr2,int n1,int n2){
        int i=n1-1;
        int j= 0;
        int temp=0;
        while(i>=0&&j<n2&&arr1[i]>arr2[j]){
              temp = arr1[i];
             arr1[i]= arr2[j];
             arr2[j]=temp;
             i--;
             j++;
        }
        Arrays.sort(arr2);
        Arrays.sort(arr1);
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
        System.out.println("enter the number of integers ");
     int n2 = scan.nextInt();
     System.out.println("entter the element ");
     int [] arr2 = new int [n2];
     for(int i =0;i<n2;i++){
         arr2[i] = scan.nextInt();
        }
        soln(arr1, arr2, n1, n2);
        for(int i =0;i<n1;i++){
            System.out.print(" " +arr1[i]);
        }
        for(int i =0;i<n2;i++){
            System.out.print(" " +arr2[i]);
        }
    }
}
