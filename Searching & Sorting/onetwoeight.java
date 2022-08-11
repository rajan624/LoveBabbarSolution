import java.util.Scanner;

public class onetwoeight {
    static int inSequence(int A, int B, int C){

if(A==B)
return 1;
if(C!=0){
int res=(B-A)%C;
if(res==0 && ( ((B-A)<0 && C<0) || ((B-A)>0 && C>0)))
return 1;}
return 0;
    }  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A= scan.nextInt();
        int B = scan.nextInt();
        int C=scan.nextInt();
        System.out.println(inSequence(A, B, C));
    }  
}
