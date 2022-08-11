import java.util.Scanner;

public class fiveeight {
    static void soln(String s, int [] arr){
        int n = s.length();
        for(int i =0;i<n;i++){
            arr[s.charAt(i)]++;
        }

    }
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the string");
    String s = scan.nextLine();
    int [] arr = new int[256];
    soln(s, arr);
    for (int i =0;i<256;i++) {
        if(arr[i]>1){
            System.out.println((char)i+" times "+arr[i]);
        }
        
    }
   } 
}
