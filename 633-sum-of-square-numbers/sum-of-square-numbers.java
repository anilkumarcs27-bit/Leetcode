class Solution {
    public boolean judgeSquareSum(int d) {
        long c = d;
        long low = 0;
        long high = (long) Math.sqrt(c);
        while (high >= low) {
            long sum = low * low + high * high;
            if (sum == c) {
                return true;
            } else if (sum > c) {
                high--;
            } else {
                low++;
            }
        }
        return false;
    }
}