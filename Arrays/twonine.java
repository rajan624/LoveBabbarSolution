import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class twonine {
    static int  sortsoln(int [] arr){
          Arrays.sort(arr);
          int i=1;
          int count =1;
          int result =0;
          while(i<arr.length){
              if(arr[i-1]==arr[i]-1){
                  count++;
              }
              else{
                  if(count>result){
                      result=count;
                  }
                  count=0;
              }
              i++;
          }
          return result;
    }
    static int hashsoln(int [] arr){
    Set<Integer> hs = new HashSet<>();
    for (int i : arr) {
        hs.add(i);
    }
    int n= arr.length;
    int count =0;
    for(int i=0;i<n;i++){
        if(!hs.contains(arr[i]-1)){
            int j =arr[i]+1; 
            while(hs.contains(j)){
                j++;
                count = Math.max(count, j-arr[i]);
            }
        }
    }
    return count;

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
    int res= sortsoln(arr);
    System.out.println("sort the soln"+res);
    int res1= hashsoln(arr);
    System.out.println("hash set the soln"+res1);
  }  
}
