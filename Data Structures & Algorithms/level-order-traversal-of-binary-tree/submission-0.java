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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> orderGroup = new ArrayList<>(); 
        Deque<TreeNode> queue = new ArrayDeque<>();
        if (root != null){
            queue.add(root);
        }
        int level = 0;
        while (queue.size() != 0){
            List<Integer> levelTree = new ArrayList<>(); 
            for(int i= queue.size(); i>0; i--){
                TreeNode node = queue.poll();
                levelTree.add(node.val);
                if (node.left != null){
                    queue.add(node.left);
                } 
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            orderGroup.add(levelTree);
            level++;
        }
        return orderGroup;
    }
}
