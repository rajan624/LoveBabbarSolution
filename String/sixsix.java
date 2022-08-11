import java.util.Scanner;

public class sixsix {
  static   String swap (String str ,int x,int y){
    char arr[] = str.toCharArray();
char tmp = arr[x];
arr[x] = arr[y];
arr[y] = tmp;

return new String(arr);
}
   static void soln(String s,int l ,int r){
        if(l==r){
            System.out.print(s+" ");
        }
        for(int i =l;i<r;i++){
            s=swap(s, l, i);
            soln(s,l+1,r);
            s=swap(s, l, i);
        }
    }
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("ente the string to print the all permutaion");
    String s = scan.next();
    soln(s,0,s.length());
}    
}
