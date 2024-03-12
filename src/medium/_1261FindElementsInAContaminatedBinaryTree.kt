package medium

import TreeNode

class _1261FindElementsInAContaminatedBinaryTree {
    class FindElements(val root: TreeNode?) {
        var list: ArrayList<Int> = ArrayList()

        init {
            restoreTree(root, 0)
        }

        fun find(target: Int): Boolean {
            root ?: return false
            return list.contains(target)
        }

        private fun restoreTree(node: TreeNode?, value: Int) {
            node ?: return
            node.`val` = value
            list.add(value)
            restoreTree(node.left, value * 2 + 1)
            restoreTree(node.right, value * 2 + 2)
        }
    }
}