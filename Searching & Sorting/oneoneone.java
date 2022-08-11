import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class oneoneone{
  static public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
         Arrays.sort(arr); 
        int n = arr.length;
         ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        for (int i = 0; i < n - 3; i++)  
        { 
       
        if (i > 0 && arr[i] == arr[i - 1]) continue;
            
            for (int j = i + 1; j < n - 2; j++)  
            { 
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;
                
               int  l = j + 1; 
                 int r = n - 1; 
                while (l < r)  
                { 
                    int old_l = l;
                    int old_r = r;
                    if (arr[i] + arr[j] + arr[l] + arr[r] == k)  
                    { 
                       ArrayList<Integer> aList=new ArrayList<>();
                            aList.add(arr[i]);
                            aList.add(arr[j]);
                            aList.add(arr[l]);
                            aList.add(arr[r]);
                            list.add(aList);
                            
                            while (l < r && arr[l] == arr[old_l]) l++;
                    while (l < r && arr[r] == arr[old_r]) r--;
                            
                
                    }  
                    else if (arr[i] + arr[j] + arr[l] + arr[r] < k) 
                        l++; 
                    else 
                        r--; 
                } 
            } 
        }
        return list;
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
    System.out.println("enter the sum");
    int k = scan.nextInt();
    System.out.println("your answer is that "+fourSum(arr, k));

}
}