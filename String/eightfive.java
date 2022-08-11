import java.util.Scanner;

public class eightfive {
    static int soln(String s ){
        int open =0;
        int close =0;
        int fault =0;
        int ans =0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==']'){
                close++;
                fault= close -open;
            }
            else{
                open++;
                if(fault>0){
                    ans+=fault;
                    fault--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string ");
        String s = scan.nextLine();
        System.out.println("your result is "+soln(s)); 
    }
}
