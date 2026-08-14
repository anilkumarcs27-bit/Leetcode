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
    public static void traverse(TreeNode node, int level, List<List<Integer>> res){
        if(node==null){
            return;
        }
        if(level == res.size()){
            res.add(new ArrayList<>());
        }
        res.get(level).add(node.val);
        traverse(node.left,level+1,res);
        traverse(node.right, level +1, res);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        // List<List<Integer>> res = new LinkedList<>();
        // if (root == null) return res;

        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.add(root);

        // while (!queue.isEmpty()) {
        //     int level_size = queue.size();
        //     List<Integer> level = new LinkedList<>();

        //     for (int i = 0; i < level_size; i++) {
        //         TreeNode node = queue.poll();
        //         level.add(node.val);

        //         if (node.left != null)
        //             queue.add(node.left);

        //         if (node.right != null)
        //             queue.add(node.right);
        //     }

        //     res.add(level);
        // }

        // return res;

        List<List<Integer>> res = new LinkedList<>();
        traverse(root,0,res);
        return res;

    }
}