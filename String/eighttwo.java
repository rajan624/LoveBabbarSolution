import java.util.Scanner;

public class eighttwo {
    public  static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }        
        return prefix;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("enter the string ");
        String str [] = new  String[n];
        for(int i=0;i<n;i++){
            str[i] = scan.next();
        } 
        System.out.println(longestCommonPrefix(str));
    }    
}
