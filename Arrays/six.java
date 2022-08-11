import java.util.Scanner;

public class six{
    public static String raverse(String rev){
        String result="";
        for(int i=rev.length()-1;i>=0;i--){
        result+=rev.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String rev = scan.next();
    rev = raverse(rev);
    System.out.println("reverser string is "+rev);
    }
}