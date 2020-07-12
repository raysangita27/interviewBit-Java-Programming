/*
Given a binary tree, return the inorder traversal of its nodes’ values.

Example :
Given binary tree

   1
    \
     2
    /
   3
return [1,3,2].

*/

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null)
            return result;
        Stack<TreeNode> stk = new Stack<TreeNode>();
        
        while(root != null || !stk.isEmpty() )
        {
            while(root != null)
            {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }
}
