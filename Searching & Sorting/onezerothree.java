import java.util.Scanner;

public class onezerothree {
    static int soln(int [] arr,int t){
        int low =0;
        int high= arr.length-1;
        while(low<=high){
            int mid = (high+low)/2;
            if(arr[mid]==t){
                return mid;
            }
            else if(arr[low]<=arr[mid]){
                if(arr[low]<=t&&arr[mid]>=t){
                    high=mid-1;
                }
                else{
                     low=mid+1;
                }
            }
            else{
                if(arr[mid]<=t&&arr[high]>=t){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
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
    System.out.println("enter the target value ");
    int t = scan.nextInt();
    System.out.println("your answer is that "+soln(arr, t));
}    
}
