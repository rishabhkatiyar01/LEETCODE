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
    public List<Integer> postorderTraversal(TreeNode root) {
        
    List<Integer> l=new ArrayList<>();
        helper(l,root);
        return l;
        
    }

    private void helper(List<Integer> l, TreeNode root){
        if(root==null )return;
        helper(l,root.left);
        helper(l,root.right);
        l.add(root.val);
    }
}