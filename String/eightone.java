import java.util.HashMap;
import java.util.Scanner;

public class eightone {
    public static int romanToDecimal(String str) {
        // code here
        int ans=0;
        int n = str.length();
        int temp;
        for(int i =0;i<n-1;i++){
            temp = res(str.charAt(i));
            if(temp<res(str.charAt(i+1)))
                temp*=-1;
                ans+=temp;
            }
            return ans+res(str.charAt(n-1));
            
        }
   static int res(char ch){
        int res =1;
        switch(ch){
             case 'M' : res =1000; break;
             case 'D' : res =500; break;
             case 'C' : res =100; break;
             case 'L' : res =50; break;
             case 'X' : res =10; break;
             case 'V' : res =5; break;
        }
         return res;
        }
       static public int romanToDecimalwithhasmap(String str) {
            // code here
            HashMap<Character,Integer> sy = new HashMap<Character,Integer>();
            sy.put('I',1);
            sy.put('V',5);
            sy.put('X',10);
            sy.put('L',50);
            sy.put('C',100);
            sy.put('D',500);
            sy.put('M',1000);
            int ans=0;
            for(int i=0;i<str.length();i++){
                if(i+1<str.length()&&sy.get(str.charAt(i))<sy.get(str.charAt(i+1))){
                    ans-=sy.get(str.charAt(i));
                }
                else{
                    ans+=sy.get(str.charAt(i));
                }
            
                
            }
            return ans;
        }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = scan.nextLine(); 
        System.out.println("soln with function "+romanToDecimal(str));
        System.out.println("soln with hashamp "+romanToDecimalwithhasmap(str));
    }
}
