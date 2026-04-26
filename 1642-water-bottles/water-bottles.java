class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int newBottles=0,remBottles=0;
        while(numBottles >= numExchange){
            newBottles = numBottles / numExchange;
            remBottles = numBottles % numExchange;
            ans += newBottles;
            numBottles = newBottles + remBottles;

        }
        return ans;
    }
}