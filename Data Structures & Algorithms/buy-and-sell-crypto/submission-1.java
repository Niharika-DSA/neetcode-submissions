class Solution {
    public int maxProfit(int[] prices) {
      int maxP=0;
      int l=0,r=1;
      while(r<prices.length)
      {
        if(prices[l]<prices[r])
        {
            int Profit=prices[r]-prices[l];
            maxP=Math.max(maxP,Profit);
        }
        else{
            l=r;
        }
        r++;
      }
      return maxP;
    }
}
