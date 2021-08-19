package medium

import java.util.*


class _39CombinationSum {
    class Solution {
        fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
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
            if (index >= candidates.size) {
                return
            }
            if (target == 0) {
                result.add(ArrayList(cur))
                return
            }
            for (i in index until candidates.size) {
                if (candidates[i] > target) {
                    break
                }
                if (i > 0 && candidates[i] == candidates[i - 1]) {
                    continue
                }
                val newTarget = target - candidates[i]
                cur.add(candidates[i])
                bfs(candidates, newTarget, i, cur, result)
                cur.removeAt(cur.size - 1)
            }
        }
    }

    class BestSolution {
        fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
            val ans: MutableList<List<Int>> = ArrayList()
            val combine: MutableList<Int> = ArrayList()
            dfs(candidates, target, ans, combine, 0)
            return ans
        }

        fun dfs(candidates: IntArray, target: Int, ans: MutableList<List<Int>>, combine: MutableList<Int>, idx: Int) {
            if (idx == candidates.size) {
                return
            }
            if (target == 0) {
                ans.add(ArrayList(combine))
                return
            }
            // 直接跳过
            dfs(candidates, target, ans, combine, idx + 1)
            // 选择当前数
            if (target - candidates[idx] >= 0) {
                combine.add(candidates[idx])
                dfs(candidates, target - candidates[idx], ans, combine, idx)
                combine.removeAt(combine.size - 1)
            }
        }
    }
}