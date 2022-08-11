
import java.util.*;
import java.util.Stack;  

class test {
    static public String result="";
    static void ispaildrone(String s ){
        boolean temp =true;
        int  n = s.length();
        int i=0, j=n-1;
        while(i<j){
          if(s.charAt(i)!=s.charAt(j)){
            temp=false;
            break;
          }
          i++;
          j--;
        }
        if(temp){
            if(result.length()<s.length()){
                result=s;
            }
        }
    }
    static void longest(String s ){
        int n =s.length();
        for(int i =0; i<n;i++){
            for(int j=i;j<=n;j++){
                ispaildrone(s.substring(i, j));
            }
        }
    }
    public static String longestpaildrone(String s ){
        int n = s.length();
        String res ="";
        for(int i =0;i<n;i++){
            int j = i;
            String ans ="";
            while(j<n && s.charAt(i)==s.charAt(j)){
                ans+=s.charAt(j);
                j++;
            }
            int k = i-1;
            while(j<n && k>=0 && s.charAt(j)==s.charAt(k)){
                ans = s.charAt(k)+ans+s.charAt(j);
                j++;
                k--;
            }
            if(ans.length()>res.length()){
                res = ans;
            }
        }
        return res;
    }
   
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
   // System.out.println(longestpaildrone(s));
    //longest(s);
    //System.out.println(result);
    System.out.println(longestpaildrone(s));
}
}
class Solution {
    public int maxArea(int[] height) {
       int r = height.length-1;
       int Area =0;
       int l =0;
       while(l<r){
           Area = Math.max(Area ,Math.min(height[l], height[r])*(r-l));
           if(height[l]<height[r]){
               l+=1;
           }
           else{
               r-=1;
           }
       }
        return Area;
    }
}