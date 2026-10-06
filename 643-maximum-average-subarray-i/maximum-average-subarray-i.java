class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int del =0, end =k;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+= nums[i];
        }
        double max =sum;
        for(int i=k;i<nums.length;i++){
            sum = sum+ nums[i]-nums[del];
            if(sum>max){
                max = sum;
            }
            del++;
        }
        return max/k;
    }
}