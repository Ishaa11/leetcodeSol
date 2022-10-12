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
    public boolean isBalanced(TreeNode root) {
        
        if(root==null) return true;
        
        int left = height(root.left);
        int right = height(root.right);
        
        if(Math.abs(left-right)>1) return false;
        
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    int height(TreeNode root){
        
        if(root==null) return 0;
        
         int l = height(root.left);
         int r = height(root.right);
        
        return Math.max(l,r)+1;
    }
    
    
}