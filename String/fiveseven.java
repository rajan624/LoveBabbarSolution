import java.util.Scanner;

public class fiveseven {
    static boolean ispaildrone(String s){
        String sl = "";
        for(int i =s.length()-1;i>=0;i--){
            sl+=s.charAt(i);
        }
        if(sl.equals(s)){
            return true;
        }
        else{
        return false;
        }
    }
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");
        String s = scan.next();
        System.out.println("your answer is thar "+ispaildrone(s));

}    
}
