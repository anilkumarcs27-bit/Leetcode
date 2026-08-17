/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean validate(TreeNode node, Integer low, Integer high){
        if(node== null) return true;
        if((low!=null &&node.val<=low)|| (high!=null && node.val>=high)) return false;
        return validate(node.left,low,node.val)&&validate(node.right,node.val,high);
    }
    public boolean isValidBST(TreeNode root) {
        // return validate(root, null, null);
        Stack<TreeNode> stack = new Stack<>();
        Integer prev = null;
        while(root!=null|| !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root= stack.pop();
            if(prev!=null && root.val <= prev){
                return false;
            }
            prev = root.val;
            root = root.right;
        }
        return true;
    }
}