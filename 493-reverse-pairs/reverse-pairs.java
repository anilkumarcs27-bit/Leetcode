class Solution {

    public static int mergeSort(int[] arr, int left, int right) {

        int count = 0;

        if (left < right) {

            int mid = left + (right - left) / 2;

            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);

            count += merge(arr, left, mid, right);
        }

        return count;
    }

    private static int merge(int[] arr, int left, int mid, int right) {

        int count = 0;

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int j = 0;

        for (int i = 0; i < n1; i++) {

            while (j < n2 &&
                   (long) leftArray[i] > 2L * rightArray[j]) {
                j++;
            }

            count += j;
        }

        int i = 0;
        j = 0;

        int k = left;

        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

        return count;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}