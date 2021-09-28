package medium

import TreeNode

class _437PathSumIII {
    class Solution {
        private val map = HashMap<Int, Int>()
        private var ans = 0
        private var target: Int = 0
        fun pathSum(root: TreeNode?, targetSum: Int): Int {
            if (root == null) {
                return 0
            }
            target = targetSum
            map[0] = 1
            dfs(root, root.`val`)
            return ans
        }

        private fun dfs(root: TreeNode, value: Int) {
            if (map.containsKey(value - target)) {
                ans += map[value - target]!!
            }
            map[value] = map.getOrDefault(value, 0) + 1
            root.left?.let {
                dfs(it, value + it.`val`)
            }
            root.right?.let {
                dfs(it, value + it.`val`)
            }
            map[value] = map.getOrDefault(value, 0) - 1
        }
    }
}






























