import java.util.Scanner;

public class thirteen {
    public static int Adeonn3(int [] arr){
        int n= arr.length;
        int result=arr[0];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    if(result<sum){
                        result=sum;
                    }
                }
            }
        }
        return result;
    }
    public static int Adeonn2( int []arr){
        int n= arr.length;
        int sum;
        int result=arr[0];
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                 sum+=arr[j];
            if(result<sum){
                result=sum;
            }
        }
    }
        return result;
}
public static int andenon1(int [] arr){
    int n = arr.length;
    int sum=arr[0];
    int result=arr[0];
    for(int i=1;i<n;i++){
        sum=Math.max(arr[i], sum+arr[i]);
        result= Math.max(sum, result);
    }
    return result;
}
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the number of element in the array");
    int n =scan.nextInt();
    int [] arr= new int[n];
    System.out.println("enter the element contigous subarry");
    for(int i=0;i<n;i++){
        arr[i]= scan.nextInt();
    }
    System.out.println("adenon algorithm by time compelxity o(n)*1");
    int result1 = andenon1(arr);
    System.out.println(result1);
    System.out.println("adenon algorithm by time compelxity o(n)*2");
    int result2 = Adeonn2(arr);
    System.out.println(result2);
    System.out.println("adenon algorithm by time compelxity o(n)*3");
    int result3 = Adeonn3(arr);
    System.out.println(result3);
}    
}
