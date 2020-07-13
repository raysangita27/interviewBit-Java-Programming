/*
Given a binary tree, return the preorder traversal of its nodes’ values.

Example :
Given binary tree

   1
    \
     2
    /
   3
return [1,2,3].

Using recursion is not allowed.
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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(A == null)
            return result;
        Stack<TreeNode> stk = new Stack<TreeNode>();
        stk.push(A);
        while(!stk.isEmpty())
        {
            TreeNode temp = stk.pop();
            result.add(temp.val);
            if(temp.right != null)
                stk.push(temp.right);
            if(temp.left != null)
                stk.push(temp.left);
        }
        return result;
    }
}
