import java.util.HashSet;
import java.util.Scanner;

public class ten {
    public static int union(int [] arrone, int [] arrtwo){
        HashSet<Integer> hs = new HashSet<Integer>();
        int i=0;
        while(i<arrone.length){
           hs.add(arrone[i]);
           i++;
        }
         i=0;
        while(i<arrtwo.length){
           hs.add(arrtwo[i]);
           i++;
        }
        return hs.size(); 
    }
public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of element in the first array");
        int n =scan.nextInt();
        int [] arrone= new int[n];
        System.out.println("enter the element");
        for(int i=0;i<n;i++){
            arrone[i]= scan.nextInt();
        }
        System.out.println("enter the number of element in the  second array");
            int m =scan.nextInt();
            int [] arrtwo= new int[m];
            System.out.println("enter the element");
            for(int i=0;i<m;i++){
                arrtwo[i]= scan.nextInt();
            }
            int result = union(arrone, arrtwo);
            System.out.println(result);

}    
}
