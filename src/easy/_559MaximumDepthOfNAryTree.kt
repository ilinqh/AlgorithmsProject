package easy

class _559MaximumDepthOfNAryTree {
    class Node(var `val`: Int) {
        var children: List<Node?> = listOf()
    }

    class Solution {
        private var ans = 0
        private var depth = 0
        fun maxDepth(root: Node?): Int {
            if (root == null) {
                return 0
            }
            if (root.children.isEmpty()) {
                ans = Math.max(ans, depth + 1)
            }
            for (item in root.children) {
                if (item != null) {
                    depth += 1
                    maxDepth(item)
                    depth -= 1
                }
            }
            return ans
        }
    }

    class OtherSolution {
        private var ans = 0
        fun maxDepth(root: Node?): Int {
            if (root == null) {
                return 0
            }
            dfs(root, 0)
            return ans
        }

        private fun dfs(root: Node, depth: Int) {
            if (root.children.isEmpty()) {
                ans = Math.max(ans, depth + 1)
            }
            for (item in root.children) {
                if (item != null) {
                    dfs(item, depth + 1)
                }
            }
        }
    }
}