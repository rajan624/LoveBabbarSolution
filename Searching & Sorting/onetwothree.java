import java.util.Arrays;
import java.util.Scanner;

public class onetwothree {
static public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int i1 = 0;
int temp = 0;
int i2 = 0;

int idx = n-1;
while(i1 < n && i2 < m){
if(arr2[i2] < arr1[i1]){
temp = arr1[idx];
arr1[idx] = arr2[i2];
arr2[i2] = temp;
idx--;
i2++;
}else{
i1++;
}
}

Arrays.sort(arr1);
Arrays.sort(arr2);

if(k<=n){
return arr1[k-1]; 
}
else{
return arr2[k-n-1];
}
}

















































  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the number of integers ");
 int n1 = scan.nextInt();
 System.out.println("entter the element ");
 Integer [] arr1 = new Integer [n1];
 for(int i =0;i<n1;i++){
     arr1[i] = scan.nextInt();
    }
  }  
}
