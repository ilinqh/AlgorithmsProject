package medium

import solution_java.TreeNode

class _1038BinarySearchTreeToGreaterSumTree {
    class Solution {
        var sum = 0
        fun bstToGst(root: TreeNode?): TreeNode? {
            if (root == null) {
                return root
            }
            bstToGst(root.right)
            sum += root.`val`
            root.`val` = sum
            bstToGst(root.left)
            return root
        }
    }
}