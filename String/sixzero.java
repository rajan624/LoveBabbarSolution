import java.util.Scanner;

public class sixzero {
    static boolean soln(String s ,String s1 ){
        String temp="";
        if(s.length()!=s1.length()){
            return false;
        }
        else{
            temp = s1+s1;
            if(temp.indexOf(s)!=-1){
                return true;
            }
            else{
                return false;
            }

        }
    } 
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the string");
      String s = scan.nextLine();
      System.out.println("enter the string");
      String s1 = scan.nextLine();
      System.out.println(soln(s, s1));

  }  
}
