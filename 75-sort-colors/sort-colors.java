class Solution {
    public void sortColors(int[] nums) {
        int n1 =0,n2=0,n0=0,size = nums.length;
        for(int i=0;i<size;i++){
            if(nums[i]==0){
                n0++;
            }else if(nums[i]==1){
                n1++;
            }else{
                n2++;
            }
        }
        int i=0;
        while(i<n0){
            nums[i]=0;
            i++;
        }
        while(i<n1+n0){
            nums[i]=1;
            i++;
        }
        while(i<n2+n1+n0){
            nums[i]=2;
            i++;
        }
    }
}