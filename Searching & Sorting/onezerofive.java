import java.util.Scanner;

import javax.naming.ldap.ManageReferralControl;

public class onezerofive {
    static int soln(int a , int  b , int c){
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        max = Math.max(max, c);
        min = Math.min(min, c);
        return (a+b+c)-max-min;
    }
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the first number");
    int a = scan.nextInt();
    System.out.println("enter the second number");
    int b = scan.nextInt();
    System.out.println("enter the third number");
    int c = scan.nextInt();
    System.out.println("your result is that "+soln(a, b, c));
}    
}
