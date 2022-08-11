import java.util.Scanner;
public class sixtwo {
    static String soln(int n){
        if(n==1){
            return "1";
        }
        if(n==2){
            return "2";
        }
        String result = "11";
        for(int i=3;i<=n;i++){
            String t ="";
            int c=1;
            result+="&";
            for(int j=1;j<result.length();j++) {
                if(result.charAt(j)!=result.charAt(j-1)){
                    t+=String.valueOf(c);
                    t+=result.charAt(j-1);
                    c=1;
                }
                else{
                    c++;
                }                
            }
            result=t;
        }
        return result;
    }
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("enter the integer");
       int n = scan.nextInt();
       System.out.println(soln(n));   
   } 
}
