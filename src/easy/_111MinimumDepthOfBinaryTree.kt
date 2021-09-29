package easy

import TreeNode

class _111MinimumDepthOfBinaryTree {
    class Solution {
        fun minDepth(root: TreeNode?): Int {
            if (root == null) {
                return 0
            }
            if (root.left == null && root.right == null) {
                return 1
            }
            var minDepth = Int.MAX_VALUE
            if (root.left != null) {
                minDepth = Math.min(minDepth, minDepth(root.left))
            }
            if (root.right != null) {
                minDepth = Math.min(minDepth, minDepth(root.right))
            }
            return minDepth + 1
        }
    }
}