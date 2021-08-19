package medium

import java.util.*

class _40CombinationSumII {
    class Solution {
        fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
            if (candidates.isEmpty()) {
                return emptyList()
            }
            val result = ArrayList<List<Int>>()
            val cur = ArrayList<Int>()
            Arrays.sort(candidates)
            bfs(candidates, target, 0, cur, result)
            return result
        }

        private fun bfs(
            candidates: IntArray,
            target: Int,
            index: Int,
            cur: MutableList<Int>,
            result: MutableList<List<Int>>
        ) {
            if (target == 0) {
                result.add(ArrayList(cur))
                return
            }
            if (index >= candidates.size) {
                return
            }
            for (i in index until candidates.size) {
                if (candidates[i] > target) {
                    break
                }
                if (i > index && candidates[i] == candidates[i - 1]) {
                    continue
                }
                val newTarget = target - candidates[i]
                cur.add(candidates[i])
                bfs(candidates, newTarget, i + 1, cur, result)
                cur.removeAt(cur.size - 1)
            }
        }
    }

}