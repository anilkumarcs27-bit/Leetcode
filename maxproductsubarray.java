class Solution {
    public int maxProduct(int[] nums) {
        int maxproduct=nums[0];
        int currmax=1,currmin=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int temp=currmax;
                currmax=currmin;
                currmin=temp;
            }
            currmax=Math.max(nums[i],nums[i]*currmax);
            currmin=Math.min(nums[i],nums[i]*currmin);
            maxproduct=Math.max(maxproduct,currmax);
        }
        return maxproduct;
    }
}
