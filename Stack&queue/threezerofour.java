import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class threezerofour {
    static void soln(int [] arr,int n){
        int [] output= new int[n];
        Arrays.fill(output, -1);
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<n;i++){
            while(!st.isEmpty()&&arr[st.peek()]<arr[i]){
                output[st.pop()]=arr[i];
            }
            st.add(i);
        }
        for (int integer : output) {
            System.out.print(" "+integer);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of element ");
        int n = scan.nextInt();
        System.out.println("enter the element ");
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
                  arr[i]=scan.nextInt();
        }
        soln(arr, n);

        
    }
}
