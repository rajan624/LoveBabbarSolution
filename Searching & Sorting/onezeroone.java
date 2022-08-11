import java.util.ArrayList;
import java.util.Scanner;

public class onezeroone{
    static  ArrayList<Integer> soln(int [] arr,int x ){
        ArrayList<Integer> a = new ArrayList<Integer>();   
        int first =-1;
        int last =-1;
        for(int i =0;i<arr.length;i++){
              if(arr[i]!=x){
                  continue;
              }
              if(first==-1){
                  first=i;
              }
              last =-1;
        }
        a.add(first);
        a.add(last);
            return a;
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
        int x =scan.nextInt();
        System.out.println("ypur reasult is that "+soln(arr, x));
    }
}