import java.util.Scanner;

public class fifteen {
    static int soln(int [] arr){
        int maxr= arr[0];
        int step = arr[0];
        int jump=1;
        if(arr.length==1){
            return 1;
        }
        else if(arr.length==0){
            return -1;
        }
        else{
            for(int i=1;i<arr.length;i++){
               if(i==arr.length-1){
                   return jump;
               }
               maxr= Math.max(maxr, i+arr[i]);
               step--;
               if(step==0){
                   jump++;
                   if(i>=maxr){
                       return -1;
                   }
                   step=maxr-i;
               }
            }
        }
        return -1;
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
    System.out.println("answer is "+soln(arr));
    }
}
