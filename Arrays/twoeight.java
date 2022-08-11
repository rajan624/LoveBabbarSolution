import java.util.Scanner;

public class twoeight {
    static int soln(int [] arr){
        int max= arr[0];
        int min=arr[0];
        int prod= arr[0];
        int temp=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                temp = max;
                max=min;
                min=temp;
            }
            max = Math.max(arr[i], arr[i]*max);
            min = Math.min(arr[i], arr[i]*min);
            prod = Math.max(max,prod);
        }
        return prod;

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
        int result = soln(arr);
        System.out.println(result);
    }
}
