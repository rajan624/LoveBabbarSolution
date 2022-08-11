import java.util.Scanner;

public class sixone {
    static boolean soln(String s1,String s2,String res ){
        int l1 = s1.length();
        int l2 = s2.length();
        int resl = res.length();
        if(l1+l2!=resl){ 
               return false;
        }
        else{
            int i=0;
            int j=0;
            int l=0;
            while(l<resl){
                if(i<l1&&s1.charAt(i)==res.charAt(l)){
                    i++;
                }
                else if(j<l2&&s2.charAt(j)==res.charAt(l)){
                    j++;
                }
                else{
                    break;
                }
                l++;
            }
        if(i<l1||j<l2){
            return false;
        }
        else{
            return true;
        }
    }

    }
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("enter the string");
       String s1 = scan.next();
       System.out.println("enter the string");
       String s2 = scan.next();
       System.out.println("enter the string");
       String res = scan.next();
       System.out.println("soln is that "+soln(s1, s2, res));

   } 
}
