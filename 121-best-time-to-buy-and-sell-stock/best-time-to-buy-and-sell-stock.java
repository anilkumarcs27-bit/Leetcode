class Solution {
    public int maxProfit(int[] prices) {
        int max =0;
        int min = prices[0];
        int n = prices.length;
        for(int i=0;i<n;i++){
            int cost = prices[i]- min;
            if(cost>max){
                max = cost;
            }
            if(prices[i]<min){
                min  = prices[i];
            }
        }
        return max;
    }
}