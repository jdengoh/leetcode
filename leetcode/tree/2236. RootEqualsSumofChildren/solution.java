// reference: https://leetcode.com/problems/root-equals-sum-of-children/solutions/4198210/tree-solving-approach-using-recurrsion-children-sum-question

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
    public boolean checkTree(TreeNode root) {
        
        //default answer is true, unless proven otherwise
        
        int sum = 0;

        // base conditions
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;

        // add 1 child node by 1 child node
        if (root.left != null) {
            sum += root.left.val;
        }

        if (root.right != null) {
            sum += root.right.val;
        }

        //recursive, return true by default unless false appears
        return (sum == root.val) && checkTree(root.left) && checkTree(root.right);

    }
}