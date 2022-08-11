import java.util.Scanner;
public class threeeight {
           static int soln(int []arr , int k){
           int n=arr.length;
            int sz=0;
           for(int v:arr){
               if(v<=k){
                   sz++;
               }
           }
           int i,j,cnt,rs;
           i=j=cnt=0;
           rs=n;
           while(j<n){
               if(arr[j]<=k){
                   cnt++;
               }
               if(j<sz-1){
                   j++;
               }else{
                   rs=Math.min(rs,sz-cnt);
                   if(arr[i]<=k){
                       cnt--;
                   }
                   i++;
                   j++;
               }
           }
           return rs;
        }
   public static void main(String[] args) {
    Scanner scan= new Scanner(System.in); 
    System.out.println("enter the number of element ");
    int n= scan.nextInt();
    int [] arr = new int[n];
    System.out.println("enter the element ");
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }

    System.out.println("enter the value of k");
    int k = scan.nextInt();
    System.out.println(soln(arr,k));

   } 
}
