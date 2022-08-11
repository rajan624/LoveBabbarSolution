import java.util.Scanner;

public class oneonetwo {
    static int soln(int [] arr){
        int ckk = arr[0];
        int res= 0;
        int ans =0;;
        int n = arr.length;
        for(int i=1;i<n;i++){
              ans = Math.max(ckk, res);
              ckk= (res+arr[i]);
              res =ans; 
        }
        return Math.max(ckk, ans);
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
    System.out.println("your answer is that "+soln(arr));
 }   
}
