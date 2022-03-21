package easy

import TreeNode

class _653TwoSumIvInputIsABst {
    class Solution {
        fun findTarget(root: TreeNode?, k: Int): Boolean {
            if (root == null) {
                return false
            }
            val map = HashMap<Int, Int>()
            return bfs(root, k, map)
        }

        private fun bfs(root: TreeNode?, k: Int, map: HashMap<Int, Int>): Boolean {
            if (root == null) {
                return false
            }
            if (map.containsKey(root.`val`)) {
                return true
            }
            map[k - root.`val`] = root.`val`
            val leftResult = bfs(root.left, k, map)
            if (leftResult) {
                return true
            }
            return bfs(root.right, k, map)
        }
    }
}