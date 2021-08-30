package medium

class _528RandomPickWithWeight {
    class Solution(w: IntArray) {
        private var total: Int = 0
        private var pre: IntArray

        init {
            pre = IntArray(w.size)
            pre[0] = w[0]
            total = w[0]
            for (i in 1 until w.size) {
                total += w[i]
                pre[i] = pre[i - 1] + w[i]
            }
        }

        fun pickIndex(): Int {
            val x = ((Math.random() * total) + 1).toInt()
            return binarySearch(x)
        }

        private fun binarySearch(x: Int): Int {
            var low = 0
            var high = pre.size - 1
            while (low < high) {
                val mid = low + (high - low) / 2
                if (pre[mid] < x) {
                    low = mid + 1
                } else {
                    high = mid
                }
            }
            return low
        }
    }
}