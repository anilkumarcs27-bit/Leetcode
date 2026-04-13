class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for (int i = 0; i < weights.length; i++) {
            right += weights[i];
            if (weights[i] > left) {
                left = weights[i];
            }
        }

        int result=0; 
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
           
            int d = 1;
            int present = 0;
            for (int w : weights) {
                if (present + w > mid) {
                    d++;
                    present = 0;
                }
                present += w;
            }

            if (d <= days) {
                result = mid;   
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}