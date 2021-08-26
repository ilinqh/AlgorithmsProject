package medium

import TreeNode

class _230KthSmallestElementInABST {
    class Solution {
        var ans = 0
        var count = 0
        fun kthSmallest(root: TreeNode, k: Int): Int {
            search(root, k)
            return ans
        }

        private fun search(node: TreeNode, k: Int) {
            if (node.left != null) {
                search(node.left!!, k)
            }
            count++
            if (count == k) {
                ans = node.`val`
                return
            }
            if (node.right != null) {
                search(node.right!!, k)
            }
        }
    }
}