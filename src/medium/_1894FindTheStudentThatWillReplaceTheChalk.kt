package medium

class _1894FindTheStudentThatWillReplaceTheChalk {
    class Solution {
        fun chalkReplacer(chalk: IntArray, k: Int): Int {
            val length = chalk.size
            if (chalk[0] > k) {
                return 0
            }
            for (i in 1 until length) {
                chalk[i] += chalk[i - 1]
                if (chalk[i] > k) {
                    return i
                }
            }
            val tempK = k % chalk[length - 1]
            return binarySearch(chalk, tempK)
        }

        private fun binarySearch(arr: IntArray, target: Int): Int {
            var low = 0
            var high = arr.size - 1
            while (low < high) {
                val middle = low + ((high - low) shr 1)
                if (arr[middle] > target) {
                    high = middle
                } else {
                    low = middle + 1
                }
            }
            return low
        }
    }
}