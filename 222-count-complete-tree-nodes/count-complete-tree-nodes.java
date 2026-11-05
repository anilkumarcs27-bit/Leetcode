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
    public int countleft(TreeNode node){
        int count =0;
        while(node.left!=null){
            count++;
            node = node.left;
      }
      return count;
    }
    public int countright(TreeNode node){
        int count =0;
        while(node.right!=null){
            count++;
            node = node.right;
      }
      return count;
    }
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left = countleft(root);
        int right = countright(root);
        if(left==right) return ((2<<(left))-1);
        else return (1+ countNodes(root.left)+ countNodes(root.right));
        
    }
}