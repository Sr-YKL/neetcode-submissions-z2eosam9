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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack =  new Stack<>();
        List<Integer> preorderTree = new ArrayList<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode nodeTree = stack.pop();
        if(nodeTree != null){
                preorderTree.add(nodeTree.val);
                if(nodeTree.left != null){
                    stack.push(nodeTree.right);
                    stack.push(nodeTree.left);
                }else if(nodeTree.right != null){
                    stack.push(nodeTree.right);
                }
            }
        }
        return preorderTree;
    }
}