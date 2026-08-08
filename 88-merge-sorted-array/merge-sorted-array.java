class Solution {
    public static void swap(int[] a, int b, int[] c,int d){
        int temp =a[b];
        a[b] = c[d];
        c[d]=temp;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1, end = m+n-1;;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                swap(nums1,i, nums1,end);
                i--;
                end--;

            }else{
                swap(nums2,j, nums1,end);
                j--;
                end--;
            }
            
        }
        while(i>=0){
            swap(nums1,i, nums1,end);
                i--;
                end--;
        }
        while(j>=0){
              swap(nums2,j, nums1,end);
                j--;
                end--;
        }
    }
}