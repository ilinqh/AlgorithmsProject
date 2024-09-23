package medium

class _1014BestSightseeingPair {
    class BadSolution {
        fun maxScoreSightseeingPair(values: IntArray): Int {
            var result = 0
            for (i in values.indices) {
                for (j in i + 1 until values.size) {
                    result = Math.max(values[i] + values[j] + i - j, result)
                }
            }
            return result
        }
    }

    class Solution {
        fun maxScoreSightseeingPair(values: IntArray): Int {
            var result = 0
            var mx = values[0] + 0
            for (i in 1 until values.size) {
                result = Math.max(result, mx + values[i] - i)
                mx = Math.max(mx, values[i] + i)
            }
            return result
        }
    }
}