package easy

import TreeNode

class _104MaximumDepthOfBinaryTree {
    class Solution {
        fun maxDepth(root: TreeNode?): Int {
            if (root == null) {
                return 0
            }
            return travelTree(root)
        }

        private fun travelTree(node: TreeNode?): Int {
            if (node == null) {
                return 0
            }
            val childDepth = Math.max(travelTree(node.left), travelTree(node.right))
            return childDepth + 1
        }
    }
}