class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();

        if (n <= 1) {
            return s;
        }

        String ans = "";
        int max = 0;

        for (int mid = 0; mid < n; mid++) {

            // Odd length palindrome
            int low = mid;
            int high = mid;

            while (low >= 0 && high < n &&
                   s.charAt(low) == s.charAt(high)) {

                int length = high - low + 1;

                if (length > max) {
                    max = length;
                    ans = s.substring(low, high + 1);
                }

                low--;
                high++;
            }

            // Even length palindrome
            low = mid;
            high = mid + 1;

            while (low >= 0 && high < n &&
                   s.charAt(low) == s.charAt(high)) {

                int length = high - low + 1;

                if (length > max) {
                    max = length;
                    ans = s.substring(low, high + 1);
                }

                low--;
                high++;
            }
        }

        return ans;
    }
}