import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class sixteen {
    public static int sortfind(int [] arr){
          Arrays.sort(arr);
          for(int i=1;i<arr.length;i++){
              if(arr[i-1]==arr[i]){
                  return i;
              }
          }
          return -1;
    }
    public static int hashsoln(int [] arr){
        Set<Integer> hs = new HashSet<Integer>();
        for (int in : arr) {
            if(hs.contains(in)){
                return in;
            }
            hs.add(in);
        }
        System.out.println(hs);
        return -1;
    }
        public static int findDuplicate(int [] nums) {
          // Find the intersection point of the two runners.
          int tortoise = nums[0];
          int hare = nums[0];
          do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
          } while (tortoise != hare);
      
          // Find the "entrance" to the cycle.
          tortoise = nums[0];
          while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
          }
      
          return hare;
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
    int result = sortfind(arr);
    System.out.println("apka result ye rha hahahha"+ result);
    int result1 = findDuplicate(arr);
    System.out.println("apka result ye rha hahahha"+ result1);
    int result2 = hashsoln(arr);
    System.out.println("apka result ye rha hahahha"+ result2);
}    
}
