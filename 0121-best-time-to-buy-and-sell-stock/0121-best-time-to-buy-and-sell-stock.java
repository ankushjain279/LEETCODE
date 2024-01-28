class Solution {
    public int maxProfit(int[] prices) {
      int buy_prise=prices[0];
      int sell_prise;
      int profit,max_profit=Integer.MIN_VALUE;
      for(int i=1;i<prices.length;i++){
          sell_prise=prices[i];
          buy_prise=Math.min(buy_prise,prices[i-1]);
          profit=sell_prise - buy_prise;
          max_profit=Math.max(max_profit,profit);
      }
      if(max_profit<0)
      {
          return 0;
      }
      else{
          return max_profit;
      }
    }
}