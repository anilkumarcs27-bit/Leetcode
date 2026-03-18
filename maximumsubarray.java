class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0]; 
        int currMax = 1;
        int currMin = 1;
       for(int num: nums){
           if(num<0){
                int temp = currMax;
                currMax= currMin;
                currMin = temp;
           }
           currMax = Math.max(num, currMax*num);
           currMin = Math.min(num, currMin*num);
           maxProduct = Math.max(maxProduct, currMax);
           System.out.print(maxProduct);

       }
        return maxProduct;
    }
}
