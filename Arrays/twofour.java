import java.util.HashSet;
import java.util.Scanner;



public class twofour {
    public static HashSet<Integer> soln( int [] arr1 ,int [] arr2 ,int [] arr3){
        int i=0;
        int j=0;
        int k=0;
        HashSet<Integer> hs = new HashSet<Integer>();
        while(i<arr1.length&&j<arr2.length&&k<arr3.length){
            if(arr1[i]==arr2[j]&&arr2[j]==arr3[k]){
                hs.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else if (arr2[j]<arr3[k]){
                j++;
            }
            else{
                k++;

            }
        }
        return hs;

    }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    HashSet<Integer> reult = new HashSet<Integer>();
    System.out.println("enter the number of element first array");
    int n1= scan.nextInt();
    int [] arr1 = new int[n1];
    System.out.println("enter the element first array");
    for(int i=0;i<n1;i++){
        arr1[i]=scan.nextInt();
    }  System.out.println("enter the number of element second  array");
    int n2= scan.nextInt();
    int [] arr2 = new int[n2];
    System.out.println("enter the element second array");
    for(int i=0;i<n2;i++){
        arr2[i]=scan.nextInt();
    }  System.out.println("enter the number of element third array");
    int n3= scan.nextInt();
    int [] arr3 = new int[n3];
    System.out.println("enter the element third array");
    for(int i=0;i<n3;i++){
        arr3[i]=scan.nextInt();
    }
    reult= soln(arr1, arr2, arr3);
    System.out.println(reult);
}    
}
