import java.util.Scanner;

public class onezeroseven {
    static void soln(int [] arr){
        int a =0;
        int b=0;
        int n = arr.length;
        for(int i =0;i<arr.length;i++){
            if(arr[Math.abs(arr[i])-1]<0){
                a=Math.abs(arr[i]);
            }
            else{
                arr[Math.abs(arr[i])-1]=-arr[Math.abs(arr[i])-1];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                b=i+1;
            }
        }
        System.out.println(a+"  "+b);
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
    soln(arr);
  }  
}
