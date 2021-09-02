package hard

import TreeNode

class _124BinaryTreeMaximumPathSum {
    class Solution {
        var maxSum = Int.MIN_VALUE

        fun maxPathSum(root: TreeNode?): Int {
            maxGain(root)
            return maxSum
        }

        private fun maxGain(root: TreeNode?): Int {
            if (root == null) {
                return 0
            }

            val leftGain = Math.max(0, maxGain(root.left))
            val rightGain = Math.max(0, maxGain(root.right))

            val priceNewPath = leftGain + root.`val` + rightGain
            maxSum = Math.max(maxSum, priceNewPath)

            return root.`val` + Math.max(leftGain, rightGain)
        }
    }
}