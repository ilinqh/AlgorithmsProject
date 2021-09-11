package medium

import TreeNode
import java.util.*

class _95UniqueBinarySearchTreesII {
    class Solution {
        fun generateTrees(n: Int): List<TreeNode?> {
            if (n == 0) {
                return emptyList()
            }

            return generateTrees(1, n)
        }

        private fun generateTrees(start: Int, end: Int): List<TreeNode?> {
            val allTrees = LinkedList<TreeNode?>()
            if (start > end) {
                allTrees.add(null)
                return allTrees
            }
            for (i in start..end) {
                val leftTrees = generateTrees(start, i - 1)
                val rightTrees = generateTrees(i + 1, end)
                for (left in leftTrees) {
                    for (right in rightTrees) {
                        val currTree = TreeNode(i)
                        currTree.left = left
                        currTree.right = right
                        allTrees.add(currTree)
                    }
                }
            }
            return allTrees
        }
    }
}