package medium

class _2178MaximumSplitOfPositiveEvenIntegers {
    class Solution {
        fun maximumEvenSplit(finalSum: Long): List<Long> {
            val result = ArrayList<Long>()
            if (finalSum % 2 != 0L) {
                return result
            }
            var tempSum = finalSum
            var i = 2L
            while (i <= tempSum) {
                result.add(i)
                tempSum -= i
                i += 2
            }
            result[result.size - 1] = result[result.size - 1] + tempSum
            return result
        }
    }
}