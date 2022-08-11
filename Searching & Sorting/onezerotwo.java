import java.util.ArrayList;
import java.util.Scanner;

public class onezerotwo {
   static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> cars = new ArrayList<Integer>();
         int chk=1;
        for(int i=0;i<n;i++){
            if(chk==arr[i]){
                cars.add(arr[i]);
            }
            chk++;
        }
        return cars;
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
        System.out.println(valueEqualToIndex(arr, n));
        
    }
}
