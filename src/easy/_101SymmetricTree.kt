package easy

import TreeNode

class _101SymmetricTree {
    class Solution {
        fun isSymmetric(root: TreeNode?): Boolean {
            return check(root, root)
        }

        private fun check(node1: TreeNode?, node2: TreeNode?): Boolean {
            if (node1 == null && node2 == null) {
                return true
            }
            if (node1 == null || node2 == null) {
                return false
            }
            return node1.`val` == node2.`val`
                    && check(node1.left, node2.right)
                    && check(node1.right, node2.left)
        }
    }
}