import java.util.Scanner;

public class threenine {
    public static boolean isPalindrome(int integer) {
        int palindrome = integer;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return integer == reverse; 
    
    }
    static boolean soln(int arr[]){
       int  count=0;
        for(int i=0;i<arr.length;i++){
            if(!isPalindrome(arr[i])){
                    count++;
                    return false;
            }
            
        }
        if(count==0){
            return true;
        }
        else{
            return false;
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
    System.out.println(soln(arr));

  }  
}
