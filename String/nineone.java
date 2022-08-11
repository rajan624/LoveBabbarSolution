import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class nineone {
   static public List<List<String>> Anagrams(String[] string_list) {
        
        // Your Code here
        List<List<String>> res=new ArrayList<>();
HashMap<String,List<String>> hm=new HashMap<>();
for(String s: string_list){
char c[]= s.toCharArray();
Arrays.sort(c);
String str=new String(c);
if(!hm.containsKey(str)){
hm.put(str,new ArrayList<>());
}
hm.get(str).add(s);
}
res.addAll(hm.values());
return res;
            
}
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the string ");
    int n = scan.nextInt();
    System.out.println("enter the string ");
    String s [] = new String[n];
    for(int i=0;i<n;i++){
        s[i]=scan.next();
    }
    System.out.println(Anagrams(s));

}
}
