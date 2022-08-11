import java.util.ArrayList;
import java.util.Scanner;

public class towseven {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the number for factorial");
    int n =scan.nextInt();
    ArrayList<Integer> arr = new ArrayList<Integer>();
       java.math.BigInteger fact = java.math.BigInteger.valueOf(1);
         for (int i = 1; i <= n; i++){
             fact = fact.multiply(java.math.BigInteger.valueOf(i));
     }
String output = fact.toString(10);
for(int j=0;j<output.length();j++){
    char l = output.charAt(j);
  int  k = Character.getNumericValue(l); 
  arr.add(k);
}
System.out.print(arr);
}
}

