import java.math.BigInteger;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
       //code here
       int N=5;
       ArrayList<Integer> arr = new ArrayList<Integer>();
       java.math.BigInteger fact = java.math.BigInteger.valueOf(1);
         for (int i = 1; i <= N; i++){
             fact = fact.multiply(java.math.BigInteger.valueOf(i));
     }
String output = fact.toString(10);
for(int j=0;j<output.length();j++){
    char l = output.charAt(j);
  int  k = Character.getNumericValue(l); 
  System.out.println(k);
  arr.add(k);
}
System.out.println(arr);
    }
}
