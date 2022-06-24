package medium

import TreeNode

class _515FindLargestValueInEachTreeRow {
    class Solution {
        fun largestValues(root: TreeNode?): List<Int> {
            if (root == null) {
                return emptyList()
            }
            val ans = ArrayList<Int>()
            val stack = java.util.ArrayDeque<TreeNode>()
            stack.add(root)
            var size: Int
            var rowMax: Int
            while (stack.isNotEmpty()) {
                rowMax = Int.MIN_VALUE
                size = stack.size
                for (i in 0 until size) {
                    val node = stack.poll()
                    rowMax = Math.max(rowMax, node.`val`)
                    if (node.left != null) {
                        stack.add(node.left)
                    }
                    if (node.right != null) {
                        stack.add(node.right)
                    }
                }
                ans.add(rowMax)
            }
            return ans
        }
    }
}