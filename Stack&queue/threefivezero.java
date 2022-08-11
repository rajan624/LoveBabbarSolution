import java.util.Scanner;
import java.util.Stack;

public class threefivezero {
    static void soln(int [][] arr,int n ){
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<n;i++){
            st.add(i);
        }
        while(st.size()>=2){
            int a =st.pop();
            int b =st.pop();
            if(arr[a][b]==0){
                st.add(a);
            }
            else{
                st.add(b);
            }
        }
        int ans =st.pop();
        for(int i =0;i<n;i++){
            if(i!=ans){
                if(arr[i][ans]==0||arr[ans][i]==1){
                   System.out.println("-1");
                   return;
                }
            }
        }
        System.out.println(ans);

    }
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("enter the number of element ");
     int n = scan.nextInt();
     int [][] arr = new int[n][n];
     for(int i=0;i<n;i++){
     for(int j=0;j<n;j++){
         arr[i][j]=scan.nextInt();
      }
    }
    soln(arr, n);
 }   
}
