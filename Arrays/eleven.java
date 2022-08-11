import java.util.Scanner;



public class eleven {
    public static int [] rotate(int [] arr){
        int temp =0;
        for(int i=arr.length-1;i>0;i--){
           temp = arr[i];
           arr[i]=arr[i-1];
           arr[i-1]=temp;
        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("enter the number of element in the array");
            int n =scan.nextInt();
            int [] arr= new int[n];
            System.out.println("enter the element");
            for(int i=0;i<n;i++){
                arr[i]= scan.nextInt();
            }
            arr= rotate(arr);
            for(int ele: arr){
                System.out.print(" "+ele);
            }
        

    }
}
