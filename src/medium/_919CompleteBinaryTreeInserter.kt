package medium

import TreeNode

class _919CompleteBinaryTreeInserter {
    class CBTInserter(root: TreeNode?) {
        private var head: TreeNode? = null
        private val queue = ArrayDeque<Int>()

        init {
            head = root
            bfs(root)
        }

        fun insert(`val`: Int): Int {
            return 0
        }

        fun get_root(): TreeNode? {
            return head
        }

        private fun bfs(root: TreeNode?) {

        }

    }
}