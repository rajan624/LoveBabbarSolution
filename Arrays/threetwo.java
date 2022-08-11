import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class threetwo {
    public static boolean solnn2(int [] arr,int [] arr1){
        int n=arr.length;
        int m = arr1.length;
        for(int i=0;i<m;i++){
            int st =0;
            for(int j=0;j<n;j++){
                if(arr1[i]==arr[j]){
                   st=1;
                    break;
                }
            }
            if(st==0){
              return false;
            }
        }
        return true;
    }
  /*  public static boolean sortsoln(int [] arr,int [] arr1){
        int n=arr.length;
        int m = arr1.length;
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int i=0;
        int j=0;
        while(i<n&&j<m){
            if(arr[i]==arr1[j]){
                i++;
                j++;
            }
            else if (arr[i]>arr[j]) {
                j++;
            }

        }
        return true;
    }*/
    static boolean hasslon(int []arr, int [] arr1){
        HashSet<Integer> s= new HashSet<Integer>();
        for(int  i: arr){
            s.add(i);
        }
        int l1=s.size();
        for(int j:arr1){
            s.add(j);
        }
        int l2=s.size();
        if(l1==l2)
        return true;
        else
        return false;
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
    System.out.println("enter the number of element ");
    int m= scan.nextInt();
    int [] arr1 = new int[m];
    System.out.println("enter the element ");
    for(int i=0;i<m;i++){
        arr1[i]=scan.nextInt();
    }
    System.out.println(solnn2(arr,arr1));
    System.out.println(hasslon(arr,arr1));
}    
}
