package leetcode.tree.226. InvertBinaryTree;

public class attempt {
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
    public TreeNode invertTree(TreeNode root) {
        
        //base condition
        if (root == null) return root;

        // swap right
        if (root.right == null) {
            root.right = root.left;
            root.left = null;
        }

        // swap left
        else if (root.left == null) {
            root.left = root.right;
            root.right = null;
        }

        //swap both
        else {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }

        invertTree(root.right);
        invertTree(root.left); 

        return root;
    }
}
}
