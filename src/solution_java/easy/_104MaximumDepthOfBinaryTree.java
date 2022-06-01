package solution_java.easy;

import solution_java.TreeNode;

public class _104MaximumDepthOfBinaryTree {
    public class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return nodeDepth(root);
        }

        private int nodeDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int childDepth = Math.max(nodeDepth(root.left), nodeDepth(root.right));
            return childDepth + 1;
        }
    }
}
