import java.util.Scanner;

public class nineseven {
    public static boolean areIsomorphic(String S1,String S2)
    {
        // Your code here
        if(S1.length()!=S2.length()){
return false;
}
int count1[] = new int[256];
int count2[] = new int[256];
for(int i = 0; i < S1.length(); i++){
if(count1[S1.charAt(i)] != count2[S2.charAt(i)]){
return false;
}else{
count1[S1.charAt(i)]++;
count2[S2.charAt(i)]++;
}
}
return true;

        

}
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the string ");
    String s = scan.next();
    System.out.println("enter the string ");
    String s1 = scan.next();
    System.out.println("your result is that "+areIsomorphic(s, s1));
}   
}
