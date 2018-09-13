package leetcode;
//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Q101 {
    // bfs
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        Stack<TreeNode> s = new Stack<>();
        while(!q.isEmpty()) {
            TreeNode element = q.remove();
            s.push(element.left);
            if (s.pop() != element.right) {
                return false;
            } else {
                q.add(element.left);
                q.add(element.right);
            }
        }
        return true;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

