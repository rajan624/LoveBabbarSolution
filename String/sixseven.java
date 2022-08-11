import java.util.Scanner;

public class sixseven {
    static int soln(String s){
        int n =s.length();
        int countz=0;
        int counto=0;
        int cnt =0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                countz++;
            }
            else{
                counto++;
            }
            if(counto==countz){
                cnt++;
            }
        }
        return cnt;
    }
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the string ");
    String s = scan.next();
    System.out.println(soln(s));
}    
}
