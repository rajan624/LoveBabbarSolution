public class seveneight {
    static int soln(int i,int j, String s, char ch [][] ,int size,int idx){
                   int found =0;
                   if(i>=0&&j>=0&&i<6 && j<6 && s.charAt(idx)==ch[i][j]){
                       char temp = s.charAt(idx);
                       ch[i][j]='0';
                       idx+=1;
                       if(idx==size){
                           found=1;
                       }
                       else{
                           found+=soln(i+1, j, s, ch, size, idx);
                           found+=soln(i-1, j, s, ch, size, idx);
                           found+=soln(i, j+1, s, ch, size, idx);
                           found+=soln(i, j-1,s, ch, size, idx);
                       }
                       ch[i][j]=temp;
                   }
                   return found;
    }
public static void main(String args[])
{
    String s= "GEEKS";
    char ch[][] = {{'D','D','D','G','D','D'},
                   {'B','B','D','E','B','S'},
                { 'B','S','K','E','B','K'},
            {'D','D','D','D','D','E' },
        {'D','D','D','D','D','E'},
    {'D','D','D','D','D','G'}};
int ans =0;
int size =5;
for(int i=0;i<6;i++){
    for(int j=0;j<6;j++){
        ans+=soln(i, j, s, ch, size, 0);
    }
}
System.out.println(ans);
}
}
