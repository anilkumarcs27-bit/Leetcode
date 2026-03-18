import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longestLength=0;
        for(int num: nums){
            set.add(num);
        }

        int start=0;
        int count=0;

        for(int num:set){
            if(!set.contains(num-1)){
                count = 1;
                start = num;
            
                while(set.contains(start +1)){
                start++;
                count++;
                System.out.print(count);
                }

                longestLength = Math.max(count, longestLength);

            }
        }

       
        return longestLength;
    }
}
