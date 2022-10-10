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
    
    public boolean search(TreeNode root, int key,TreeNode copy)
   {
    if (root==null)
        return false;
    if((root.val == key) && root!=copy)
        return true;
 
    // Key is greater than root's key
    if (root.val < key)
       return search(root.right, key,copy);

    return search(root.left, key,copy);
    }
    public boolean function(TreeNode root, int k,TreeNode parent) {
        if(root == null) {
            return false;
        }
        if(function(root.left, k,parent) || function(root.right, k,parent) ){
            return true;
        }
        return search(parent,k-root.val,root);
    }
    public boolean findTarget(TreeNode root, int k) {
       return function(root,k,root);
    }
    
}