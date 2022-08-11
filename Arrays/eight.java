import java.util.Scanner;

public class eight {
    public static int [] sort(int [] arr){
        int start= 0;
        int end= arr.length-1;
        int temp;
        for(int i=0;i<=end;i++){
            if(arr[i]==0){
              temp = arr[start];
              arr[start]=arr[i];
              arr[i]=temp;
              start++;
            }
            if(arr[i]==2){
              temp= arr[i];
              arr[i]= arr[end];
              arr[end]=temp;
              end--;
              i--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of element in the array");
        int n =scan.nextInt();
        int [] arr= new int[n];
        System.out.println("enter the element 0 1 and 2");
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        arr=sort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        
    }
}
