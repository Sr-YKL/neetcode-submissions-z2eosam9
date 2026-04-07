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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> listTraversal = new ArrayList<>();
        inorder(root,listTraversal);
        return listTraversal;
    }
    private void inorder(TreeNode root,List<Integer> listTraversal){
        if (root == null) return;
        inorder(root.left, listTraversal);
        listTraversal.add(root.val);
        inorder(root.right, listTraversal);

    }

}