import java.util.Scanner;

public class onezeroeight {
    static int soln(int a[], int s)
    {
        // your code here
        int b =a[0];
        int c =1;
        for(int i=1;i<s;i++){
            if(b==a[i]){
                c++;
            }
            else{
                c--;
            }
            if(c==0){
                b=a[i];
                c=1;
            }
        }
        int m=0;
        for(int i =0;i<s;i++){
            if(b==a[i]){
                m++;
            }
        }
        if(s/2<m){
            return b;
        }
            else
            return -1;
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
    System.out.println(soln(arr,arr.length));
   } 
}
