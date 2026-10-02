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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }else if(root.val==key){
            return helper(root);
        }
        TreeNode dummy = root;
        while(dummy!=null){
            if(key<dummy.val){
                if(dummy.left!=null && dummy.left.val==key){
                    dummy.left = helper(dummy.left);
                    break;
                }else{
                    dummy = dummy.left;
                }
            }else{
                if(dummy.right!=null && dummy.right.val==key){
                    dummy.right = helper(dummy.right);
                    break;
                }else{
                    dummy = dummy.right;
            }
        }
        }
        return root;

}
     TreeNode helper(TreeNode root){
        // root = root.left;
        if(root.right==null){
            return root.left;
        }else if(root.left==null){
            return root.right;
        }else{
            TreeNode rightchild = root.right;
            TreeNode lastright = findlastright(root.left);
            lastright.right = rightchild;
        }
        return root.left;
    }
    public TreeNode findlastright(TreeNode root){
        while(root.right!=null){
            root = root.right;
        }
        return root;
    }
}