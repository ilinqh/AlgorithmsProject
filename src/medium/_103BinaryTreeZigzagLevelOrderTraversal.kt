package medium

import TreeNode
import java.util.*

class _103BinaryTreeZigzagLevelOrderTraversal {
    class Solution {
        fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
            val result = ArrayList<List<Int>>()
            if (root == null) {
                return result
            }
            val queue = LinkedList<TreeNode>()
            queue.offer(root)
            var toRight = true
            while (queue.isNotEmpty()) {
                val level = LinkedList<Int>()
                val currentLevelSize = queue.size
                for (i in 0 until currentLevelSize) {
                    val node = queue.poll()
                    if (toRight) {
                        level.offerLast(node.`val`)
                    } else {
                        level.offerFirst(node.`val`)
                    }
                    if (node.left != null) {
                        queue.offer(node.left)
                    }
                    if (node.right != null) {
                        queue.offer(node.right)
                    }
                }
                toRight = !toRight
                result.add(level)
            }
            return result
        }
    }
}