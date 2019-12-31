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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new LinkedList<>();
        dfs(root1, l1);
        dfs(root2, l2);
        int i = 0, j = 0;
        List<Integer> res = new LinkedList<>();

        while(i < l1.size() || j < l2.size()) {
            if (i == l1.size()) {
                res.add(l2.get(j));
                j++;
            } else if (j == l2.size()) {
                res.add(l1.get(i));
                i++;
            } else {
                if (l1.get(i) < l2.get(j)) {
                    res.add(l1.get(i));
                    i++; 
                } else {
                    res.add(l2.get(j));
                    j++;
                }
            }
        }
        return res;
         
    }
    
    public void dfs(TreeNode root, List<Integer> res) {
        if (root == null) return;
        dfs(root.left, res);
        res.add(root.val);
        dfs(root.right, res);
        return;
    }
}
