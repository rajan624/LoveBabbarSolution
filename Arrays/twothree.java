import java.util.Scanner;

public class twothree {
    public static int soln(int [] arr , int k){
        int i=0;
        int j=arr.length-1;
        int count=0;
        while(i<arr.length&&j>=0){
            if(i!=j){
                if(arr[i]+arr[j]==k){
                    count++;
                }
                j--;
            }
            else{
                j=arr.length-1;
                i++;

            }
        }
        return count;
    }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the number of element ");
    int n= scan.nextInt();
    int [] arr = new int[n];
    System.out.println("enter the element ");
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }
    System.out.println("enter the value of k");
    int k = scan.nextInt();
    int result = soln(arr, k);
    System.out.println("counting are the "+ result);
  }  
}
