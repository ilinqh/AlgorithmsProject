package medium

import TreeNode

class _199BinaryTreeRightSideView {
    class Solution {
        fun rightSideView(root: TreeNode?): List<Int> {
            if (root == null) {
                return emptyList()
            }
            val result = ArrayList<Int>()
            val queue = ArrayDeque<TreeNode>()
            queue.add(root)
            while (queue.isNotEmpty()) {
                val size = queue.size
                for (i in 0 until size) {
                    val treeNode = queue.removeFirst()
                    if (i == size - 1) {
                        result.add(treeNode.`val`)
                    }
                    treeNode.left?.let {
                        queue.add(it)
                    }
                    treeNode.right?.let {
                        queue.add(it)
                    }
                }
            }
            return result
        }
    }
}