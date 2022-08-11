import java.util.Scanner;

public class ninethree {
  static  public String removeConsecutiveCharacter(String s){
        int n =s.length();
        String r =String.valueOf(s.charAt(0));
        int j=0;
        for(int i =1;i<n;i++){
            if(r.charAt(j)!=s.charAt(i)){
            r+=s.charAt(i);
            j++;
        }
        
    }
    return r;
}
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the string ");
    String s = scan.next();
    System.out.println("your answer is that "+removeConsecutiveCharacter(s));

}    
}
