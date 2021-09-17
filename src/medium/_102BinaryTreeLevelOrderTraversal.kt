package medium

import TreeNode
import java.util.*

class _102BinaryTreeLevelOrderTraversal {
    class Solution {
        fun levelOrder(root: TreeNode?): List<List<Int>> {
            val result = ArrayList<List<Int>>()
            if (root == null) {
                return result
            }
            val queue = LinkedList<TreeNode>()
            queue.offer(root)
            while (queue.isNotEmpty()) {
                val level = ArrayList<Int>()
                val currentLevelSize = queue.size
                for (i in 0 until currentLevelSize) {
                    val node = queue.poll()
                    level.add(node.`val`)
                    if (node.left != null) {
                        queue.offer(node.left)
                    }
                    if (node.right != null) {
                        queue.offer(node.right)
                    }
                }
                result.add(level)
            }
            return result
        }
    }
}