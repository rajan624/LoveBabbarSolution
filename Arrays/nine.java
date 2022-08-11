import java.util.Scanner;

public class nine {
    public static int [] sortone(int [] arr){
       int j=0;
       int temp=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]<0){
               if(i!=j){
                  temp= arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
               }
               j++;
           }
       }
       return arr;
    }
    public static int [] sorttwo(int [] arr){
        int j=arr.length-1;
        int i=0;
        int temp=0;
        while(i<=j){
            if(arr[i]>0&&arr[j]<0){
                temp= arr[i];
                arr[i]=arr[j];
                arr[j] =temp;
                i++;
                j--;
            }
            else if(arr[i]<0&&arr[j]<0){
                i++;
            }
            else if(arr[i]<0&&arr[j]>0){
                j--;
                i++;
            }
            else{
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of element in the array");
        int n =scan.nextInt();
        int [] arr= new int[n];
        System.out.println("enter the postive and negative element");
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        arr= sorttwo(arr);
        for(int ele: arr){
            System.out.print(" "+ele);
        }

    }
}
