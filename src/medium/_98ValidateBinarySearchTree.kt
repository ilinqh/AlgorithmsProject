package medium

import TreeNode
import java.util.*

class _98ValidateBinarySearchTree {
    class Solution {
        fun isValidBST(tempRoot: TreeNode?): Boolean {
            var root = tempRoot
            val stack = LinkedList<TreeNode>()
            var inorder = Long.MIN_VALUE
            while (stack.isNotEmpty() || root != null) {
                while (root != null) {
                    stack.push(root)
                    root = root.left
                }
                root = stack.pop()
                if (root.`val` <= inorder) {
                    return false
                }
                inorder = root.`val`.toLong()
                root = root.right
            }
            return true
        }
    }
}