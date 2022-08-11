import java.util.Scanner;

public class fivesix{
    static String soln(String s){
        String sl= "";
        for(int i=s.length()-1;i>=0;i--){
            sl+=s.charAt(i);
        }
        return sl;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");
        String s = scan.next();
        System.out.println("revers the string is "+soln(s));

    }
}