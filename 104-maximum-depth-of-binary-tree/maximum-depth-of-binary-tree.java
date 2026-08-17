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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        int depth = 0;
        while(!que.isEmpty()){
            int level_size = que.size();
            depth++;
            for(int i=0;i<level_size;i++){
                TreeNode curr_node = que.poll();
                if(curr_node.left!=null) que.add(curr_node.left);
                if(curr_node.right!= null) que.add(curr_node.right);

            }
        }
        return depth;
    }
}