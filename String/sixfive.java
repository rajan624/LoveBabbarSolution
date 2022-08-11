import java.util.Scanner;

public class sixfive {
    static void soln(String t , int i, int n ,String s){
        if(i==n){
            System.out.print(t+" ");
        }
        else{
        soln(t, i+1, n, s);
        t+=s.charAt(i);
        soln(t, i+1, n, s);
        }
    }
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        String s = scan.next();
        soln("", 0, s.length(), s);
    }
    
}
