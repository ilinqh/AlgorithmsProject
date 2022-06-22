package medium

import TreeNode

class _513FindBottomLeftTreeValue {
    class Solution {
        fun findBottomLeftValue(root: TreeNode): Int {
            val stack = java.util.ArrayDeque<TreeNode>()
            stack.push(root)
            var length: Int
            var ans = root.`val`
            while (stack.isNotEmpty()) {
                length = stack.size
                ans = stack.peek().`val`
                for (i in 0 until length) {
                    val top = stack.pop()
                    if (top.left != null) {
                        stack.add(top.left)
                    }
                    if (top.right != null) {
                        stack.add(top.right)
                    }
                }
            }
            return ans
        }
    }
}