import java.util.Scanner;

public class sevenzero {
    static int [] soln(int [] nums){
    int i = nums.length - 2;
    while (i >= 0 && nums[i + 1] <= nums[i]) {
        i--;
    }
    if (i >= 0) {
        int j = nums.length - 1;
        while (nums[j] <= nums[i]) {
            j--;
        }
        int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
        }
    int m = i+1, j = nums.length - 1;
    while (m< j) {
        int temp = nums[m];
        nums[m] = nums[j];
        nums[j] = temp;
        m++;
        j--;
    }
    return nums;
}

public static void reverse(int[] nums, int start) {
    int i = start, j = nums.length - 1;
    while (i < j) {
        swap(nums, i, j);
        i++;
        j--;
    }
}

private static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }
    arr =soln(arr);
for (int i : arr) {
    System.out.print(" "+i);
}
}    
}
