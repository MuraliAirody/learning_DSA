public class Stock_Sell {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
    }

    // static int maxProfit(int[] prices) {
    //     int maxProf = 0;
    //     for(int i=0;i<prices.length;i++){
    //         int profit = 0;
    //         for(int j=i+1;j<prices.length;j++){
    //            if(prices[i]<prices[j])
    //               { 
    //                 profit = prices[j]-prices[i];
    //                 maxProf = Math.max(profit,maxProf);
    //               }
    //         }
    //     }

    //     return maxProf;
    // }

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            profit = Math.max(profit,prices[i]-min);
            min = Math.min(min,prices[i]);
        }

        return profit;
    }
}
