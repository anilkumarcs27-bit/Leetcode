class Solution {
    public static void reverse(int[] arr, int start, int end){
    for(int i = start; i < start + (end - start + 1) / 2; i++){
        int temp = arr[i];
        arr[i] = arr[end - (i - start)];
        arr[end - (i - start)] = temp;
    }
}
    public void nextPermutation(int[] nums) {
     int index =-1;
     int n = nums.length;
     for(int i=n-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            index =i;
            break;
        }
     }   
     if(index==-1){
        reverse(nums,0,n-1);
        return;
     }
     for(int i=n-1;i>index;i--){
        if(nums[i]>nums[index]){
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
            break;
        }
     }
     reverse(nums,index+1,n-1);
     return;
    }
}