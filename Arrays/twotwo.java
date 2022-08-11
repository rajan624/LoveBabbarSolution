import java.util.Scanner;

public class twotwo {
    public static int soln(int [] arr){
        int profit =0;
        int max=0; 
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                profit = arr[j]-arr[i];
                if(profit>max){
                    max=profit;
                }
            }
        }
        return max;
    }
    public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
    }
        return maxprofit;
    }
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }
    int result = soln(arr);
    System.out.println("brute force  "+result);
  int result1 = maxProfit(arr);
    System.out.println("Algorithm  "+result1);

   } 
}
