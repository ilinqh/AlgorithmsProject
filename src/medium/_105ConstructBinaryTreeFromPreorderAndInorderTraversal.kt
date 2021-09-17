package medium

import TreeNode

class _105ConstructBinaryTreeFromPreorderAndInorderTraversal {
    class Solution {
        private val map = HashMap<Int, Int>()
        fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
            val length = preorder.size
            for (i in inorder.indices) {
                map[inorder[i]] = i
            }
            return buildMyTree(preorder, inorder, 0, length - 1, 0, length - 1)
        }

        private fun buildMyTree(
            preorder: IntArray,
            inorder: IntArray,
            preorderLeft: Int,
            preorderRight: Int,
            inorderLeft: Int,
            inorderRight: Int
        ): TreeNode? {
            if (preorderLeft > preorderRight) {
                return null
            }
            val inorderRoot = map[preorder[preorderLeft]]!!
            val root = TreeNode(preorder[preorderLeft])
            val sizeLeftSubTree = inorderRoot - inorderLeft
            root.left = buildMyTree(
                preorder,
                inorder,
                preorderLeft + 1,
                preorderLeft + sizeLeftSubTree,
                inorderLeft,
                inorderRoot - 1
            )
            root.right = buildMyTree(
                preorder,
                inorder,
                preorderLeft + sizeLeftSubTree + 1,
                preorderRight,
                inorderRoot + 1,
                inorderRight
            )
            return root
        }
    }
}