import java.util.Arrays;
import java.util.Scanner;

public class threethree {
    static boolean soln(int [] arr){
        int l, r; 
  
        Arrays.sort(arr); 
        int N= arr.length;

        for (int i = 0; i < N - 2; i++) {
            l = i + 1; 
            r = N - 1;  
            while (l < r) { 
                if (arr[i] + arr[l] + arr[r] == X) { 
                    return true; 
                } 
                else if (arr[i] +arr[l] + arr[r] < X) 
                    l++; 
  
                else 
                    r--; 
            } 
        } 
        return false; 
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
}    
}
