package medium

import TreeNode

class _2415ReverseOddLevelsOfBinaryTree {
    class Solution {
        fun reverseOddLevels(root: TreeNode?): TreeNode? {
            root ?: return root
            var isOdd = false
            val queue = ArrayDeque<TreeNode>()
            queue.add(root)
            while (queue.isNotEmpty()) {
                val size = queue.size
                val array = ArrayList<TreeNode>()
                for (i in 0 until size) {
                    val node = queue.removeFirst()
                    if (isOdd) {
                        array.add(node)
                    }
                    if (node.left != null) {
                        queue.add(node.left!!)
                        queue.add(node.right!!)
                    }
                }
                if (isOdd) {
                    var left = 0
                    var right = size - 1
                    while (left < right) {
                        val temp = array[left].`val`
                        array[left].`val` = array[right].`val`
                        array[right].`val` = temp
                        left += 1
                        right -= 1
                    }
                }

                isOdd = isOdd xor true
            }
            return root
        }
    }
}