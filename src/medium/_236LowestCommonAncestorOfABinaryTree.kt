package medium

import TreeNode

class _236LowestCommonAncestorOfABinaryTree {
    class Solution {
        private val parent = HashMap<Int, TreeNode>()
        private val visited = HashSet<Int>()

        private fun dfs(root: TreeNode) {
            if (root.left != null) {
                parent[root.left!!.`val`] = root
                dfs(root.left!!)
            }
            if (root.right != null) {
                parent[root.right!!.`val`] = root
                dfs(root.right!!)
            }
        }

        fun lowestCommonAncestor(root: TreeNode?, tempP: TreeNode?, tempQ: TreeNode?): TreeNode? {
            if (root == null || tempP == null || tempQ == null) {
                return null
            }
            dfs(root)
            var p = tempP
            while (p != null) {
                visited.add(p.`val`)
                p = parent[p.`val`]
            }
            var q = tempQ
            while (q != null) {
                if (visited.contains(q.`val`)) {
                    return q
                }
                q = parent[q.`val`]
            }
            return null
        }


    }
}