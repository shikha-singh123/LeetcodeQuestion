class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<=1){
            return 0;
        }
           int minSoFar=prices[0];
           int maxProfit=0;
       for(int i=1;i<prices.length;i++){
               minSoFar=Math.min(minSoFar,prices[i]);
              int Profit=prices[i]-minSoFar;
              maxProfit=Math.max(maxProfit,Profit);


       }
       return maxProfit;
    }
}
