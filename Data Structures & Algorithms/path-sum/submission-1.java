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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        return leafPath(root,targetSum);
    }

    private boolean leafPath(TreeNode root, int targetSum){
        System.out.println(root.val);
        if (root.left == null && root.right == null && root.val - targetSum == 0){
            return true;
        }
        boolean foundInLeft = false ,foundInRight = false;
        if (root.left != null){
           foundInLeft = leafPath(root.left, targetSum - root.val);
        }
        if (root.right != null){
           foundInRight = leafPath(root.right, targetSum - root.val);
        }
        return foundInLeft || foundInRight;
    }
}