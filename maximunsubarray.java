//https://leetcode.com/problems/maximum-subarray/submissions/1873094439/
// Question 53

class Solution {
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int num: nums){
            currSum += num;

            if(currSum > maxSum) {
                maxSum = currSum;
            }
            if(currSum <0) {
                currSum = 0;
            }
        }
    return maxSum;

    }

    public static void main(String[] args) {
       int element =  maxSubArray(new int[]{1,2,2,1,1});
        System.out.println(element);
    
    }
}
