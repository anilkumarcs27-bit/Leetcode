class Solution {
    public int findMin(int[] a) {
        int low =0, high = a.length-1, min= Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            // if(a[low]==a[mid] && a[mid]==a[high]){
            //     low++;
            //     high--;
            //     continue;
            // }
            if(a[low]<=a[mid]){
                min = Math.min(min, a[low]);
                low= mid+1;
            }else{
                min = Math.min(min, a[mid]);
                high = mid-1;
            }
        }
        return min;
    }
}