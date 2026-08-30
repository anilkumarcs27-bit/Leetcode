class Solution {
    static void solve(int ind, int target, int[] candidates, List<Integer> output, List<List<Integer>> ans, int count, int k){
        if(count>k) return;
        if(count==k && target==0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(target<0) return;
        if(ind>=candidates.length) return;
        output.add(candidates[ind]);
        solve(ind+1, target-candidates[ind], candidates, output, ans, count+1,k);
        output.remove(output.size()-1);
        while(ind<candidates.length-1 && candidates[ind]==candidates[ind+1]){
            ind++;
        }
        solve(ind+1, target, candidates, output, ans, count, k);

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] candidates = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int count =0;
        solve(0, n, candidates, output, ans, count, k );
         return ans;
    }
}