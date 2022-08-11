import java.io.*;
import java.util.*;
public class result {
public static void main(String[] args) {
    BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    int n =2;
  
    int [] a = new int[n];
   
    try {
        String str =br.readLine();
        String[] strs = str.trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.valueOf(strs[i]);
        }
        for(int i =0;i<n;i++){
            System.out.println(a[i]);
        }

    } catch (Exception e) {
        //TODO: handle exception
    }
    
}    
}
