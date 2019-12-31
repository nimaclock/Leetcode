/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        int depth = depth(root);
        return dfs(root, 1, depth);
    }
    
    public int dfs(TreeNode root, int lvl, int depth) {
        if (root == null) return 0;
        if (lvl == depth) return root.val;
        return dfs(root.left, lvl+1, depth) +  dfs(root.right, lvl+1, depth);
    }
    
    public int depth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        else return Math.max(depth(root.left), depth(root.right))+1;
    }
}
