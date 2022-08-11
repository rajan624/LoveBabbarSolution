import java.util.Arrays;
import java.util.Scanner;

public class oneoneseven {
    static void soln(Integer arr [] ){
        Arrays.sort(arr, (a,b) -> Integer.compare(Integer.bitCount(b), Integer.bitCount(a)));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of integers ");
     int n1 = scan.nextInt();
     System.out.println("entter the element ");
     Integer [] arr1 = new Integer [n1];
     for(int i =0;i<n1;i++){
         arr1[i] = scan.nextInt();
        }
        soln(arr1);
        for (int i : arr1) {
            System.out.print(" "+i);
        }
    }
}
