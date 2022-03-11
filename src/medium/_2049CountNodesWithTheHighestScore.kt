package medium

class _2049CountNodesWithTheHighestScore {
class Solution {
    private var ans = 0
    private var max = 0L
    private var length = 0
    private lateinit var children: Array<ArrayList<Int>>

    fun countHighestScoreNodes(parents: IntArray): Int {
        length = parents.size
        children = Array(length) { ArrayList<Int>() }
        for (i in 0 until length) {
            val p = parents[i]
            if (p != -1) {
                children[p].add(i)
            }
        }
        dfs(0)
        return ans
    }

    private fun dfs(node: Int): Int {
        var score = 1L
        var size = length - 1
        for (i in children[node].indices) {
            val c = children[node][i]
            val t = dfs(c)
            score *= t
            size -= t
        }
        if (node != 0) {
            score *= size
        }
        if (score == max) {
            ans += 1
        } else if (score > max) {
            max = score
            ans = 1
        }
        return length - size
    }
}
}