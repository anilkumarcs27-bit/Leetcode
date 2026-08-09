class Solution {
    public static int firstn(int[] nums, int target){
        int n = nums.length;
        int low =0,high = n-1, first =-1;
        while(low<=high){
        int mid = low+ (high-low)/2;
            if(nums[mid]== target){
                first =mid;
                high = mid-1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return first;
        
    }
     public static int second(int[] nums, int target){
        int n = nums.length;
        int low =0,high = n-1, sec =-1;
        while(low<=high){
        int mid = low+ (high-low)/2;
            if(nums[mid]== target){
                sec =mid;
                low = mid+1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return sec;
        
    }
    public int[] searchRange(int[] nums, int target) {
        int first = firstn(nums,target);
        if(first ==-1) return new int[]{-1,-1};
        return new int[]{first, second(nums,target)};
    }
}