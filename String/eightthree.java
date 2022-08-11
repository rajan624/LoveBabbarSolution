import java.util.Scanner;

public class eightthree {
    public static int minFlips(String s) {
        // Code here
        int c1=0;
        int c2=0;
        int n= s.length();
        for(int i=0;i<n;i++){
            if(i%2!=0&&s.charAt(i)=='0')c1++;
            if(i%2==0&&s.charAt(i)=='1')c1++;
            if(i%2!=0&&s.charAt(i)=='1')c2++;
            if(i%2==0&&s.charAt(i)=='0')c2++;
        }
        return Math.min(c1,c2);
    }
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the string ");
    String s = scan.nextLine();
    System.out.println("soln is that "+minFlips(s));
 }   
}
