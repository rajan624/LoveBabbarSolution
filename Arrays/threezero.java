import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class threezero {
    public static void solnon2(int [] arr, int k){
        HashSet<Integer> arr1= new HashSet<Integer>();
        int n= arr.length;
       
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>=n/k){
                arr1.add(arr[i]);
            }
           
        }
        System.out.println(arr1);

    }
    public static void morethanNdK(int a[], int n, int k)
    {
        int x = n / k;
        HashMap<Integer, Integer> y = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            if (!y.containsKey(a[i]))
                y.put(a[i], 1);
           
            else
            {
                int count = y.get(a[i]);
                y.put(a[i], count + 1);
            }
        }
        for (Map.Entry m : y.entrySet())
        {
            Integer temp = (Integer)m.getValue();
            if (temp >= x)
                System.out.println(m.getKey()+" repeat times"+m.getValue());
        }
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
    System.out.println("enter the value of k");
    int k =scan.nextInt();
    solnon2(arr, k);
    morethanNdK(arr, arr.length, k);
}    
}
