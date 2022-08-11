import java.util.Scanner;

public class onezreofour {
    static int soln(int n ){
        int res =0;
        for(int i=1;i<n/2;i++)
        if(i*i<=n){
            res++;
        }
        else{
            break;
        }
        return res;
    }
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the integer to find the sqauare");
      int n = scan.nextInt();
      System.out.println("your answer is that "+soln(n));
  }  
}
