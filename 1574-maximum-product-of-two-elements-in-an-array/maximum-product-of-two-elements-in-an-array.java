class Solution {
    public int maxProduct(int[] nums) {
        int max=-1,sec_max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                sec_max = max;
                max = nums[i];
            }else if(sec_max<nums[i]){
                sec_max = nums[i];
            }
            
        }
        int ans = (max-1)*(sec_max-1);
        return ans;
    }
}