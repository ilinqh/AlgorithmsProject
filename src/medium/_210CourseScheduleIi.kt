package medium

class _210CourseScheduleIi {
    class Solution {
        private lateinit var edges: ArrayList<ArrayList<Int>>
        private lateinit var visited: IntArray
        private lateinit var result: IntArray
        private var valid = true
        private var index = 0

        fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray {
            edges = ArrayList()
            for (i in 0 until numCourses) {
                edges.add(ArrayList())
            }
            visited = IntArray(numCourses)
            result = IntArray(numCourses)
            index = numCourses - 1
            for (i in prerequisites.indices) {
                val info = prerequisites[i]
                edges[info[1]].add(info[0])
            }
            var i = 0
            while (i < numCourses && valid) {
                if (visited[i] == 0) {
                    dfs(i)
                }
                i += 1
            }
            if (!valid) {
                return IntArray(0)
            }
            return result
        }

        private fun dfs(u: Int) {
            visited[u] = 1
            for (i in edges[u].indices) {
                val v = edges[u][i]
                if (visited[v] == 0) {
                    dfs(v)
                    if (!valid) {
                        return
                    }
                } else if (visited[v] == 1) {
                    valid = false
                    return
                }
            }
            visited[u] = 2
            result[index] = u
            index -= 1
        }
    }
}