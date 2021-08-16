package easy

import TreeNode

class _94BinaryTreeInorderTraversal {

class Solution {
    private lateinit var result: ArrayList<Int>

    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) {
            return emptyList()
        }
        result = ArrayList<Int>()
        traversal(root)
        return result
    }

    private fun traversal(node: TreeNode) {
        node.left?.let {
            traversal(it)
        }
        result.add(node.`val`)
        node.right?.let {
            traversal(it)
        }
    }
}
}