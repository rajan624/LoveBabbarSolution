import java.util.Scanner;

public class sixthree {
    static String soln(String s){
        String reult ="";
        int n = s.length();
        for(int i=0;i<n;i++){
            String ans ="";
            int j=i;
            while(j<n&&s.charAt(i)==s.charAt(j)){
                ans+=s.charAt(j);
                j++;
            }
            int k =i-1;
            while(k>=0&&j<n&&s.charAt(k)==s.charAt(j)){
                ans = s.charAt(k)+ans+s.charAt(j);
                k--;
                j++;
            }
            if(ans.length()>reult.length()){
                reult=ans;
            }
        }
        return reult;
    }
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    System.out.println(soln(s));

}    
}
