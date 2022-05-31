package easy

import TreeNode

class _226InvertBinaryTree {
    class Solution {
        fun invertTree(root: TreeNode?): TreeNode? {
            if (root == null) {
                return root
            }
            val tempLeft = root.left
            root.left = root.right
            root.right = tempLeft
            invertTree(root.left)
            invertTree(root.right)
            return root
        }
    }
}