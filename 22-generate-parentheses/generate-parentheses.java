class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        sol("",0,0,n,ans);
        return ans;
        
    }
    public static void sol(String s, int open, int close, int n, ArrayList<String> ans){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(open<n){
            sol(s+"(", open+1, close, n, ans);
        }
        if(close< open){
            sol(s+")", open, close+1, n , ans);
        }
    }
}