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
        
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        
        if(root==null) return list;
        
        s.push(root);
        
        while(!s.isEmpty()){
            TreeNode mynode = s.pop();
            list.add(mynode.val);
            
            
            if(mynode.right!=null) s.push(mynode.right);
            
            if(mynode.left!=null) s.push(mynode.left);
            
        }
        
        return list;
    }
}