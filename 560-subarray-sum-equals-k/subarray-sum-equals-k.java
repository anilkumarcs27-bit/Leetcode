import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int size  = nums.length;
        int[] prefix = new int[size];
        int count =0;
        prefix[0] = nums[0];
        if(nums[0]==k){
            count++;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(prefix[0], 1);
        for(int i=1;i<size;i++){
            prefix[i] = prefix[i-1]+ nums[i];
            if(prefix[i]==k){
                count++;
            }
            
            int val = prefix[i]-k;
            if(map.containsKey(val)){
                count+= map.get(val);
            }
            map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);
        }
        return count;
    }
}