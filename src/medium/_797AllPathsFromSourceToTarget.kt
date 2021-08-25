package medium

class _797AllPathsFromSourceToTarget {
    class Solution {
        private val ans = ArrayList<List<Int>>()
        private val stack = ArrayDeque<Int>()
        fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
            stack.addLast(0)
            dfs(graph, 0, graph.size - 1)
            return ans
        }

        private fun dfs(graph: Array<IntArray>, x: Int, n: Int) {
            if (x == n) {
                ans.add(ArrayList<Int>(stack))
                return
            }
            for (y in graph[x]) {
                stack.addLast(y)
                dfs(graph, y, n)
                stack.removeLast()
            }
        }
    }
}