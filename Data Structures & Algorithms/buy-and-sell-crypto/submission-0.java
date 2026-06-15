class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int l = 0; //buying
        int r = l; // seeling

        while(r < prices.length){
            if(prices[l] < prices[r]){
                res = Math.max(res, prices[r] - prices[l]);
            }else{
                l = r;
            }
            r++;
        }
        return res;
    }
}
