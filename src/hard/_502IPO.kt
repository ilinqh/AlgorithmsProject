package hard

import java.util.*

class _502IPO {
    class Solution {
        fun findMaximizedCapital(k: Int, w: Int, profits: IntArray, capital: IntArray): Int {
            val length = profits.size
            val arr = Array(length) { IntArray(2) }
            for (i in 0 until length) {
                arr[i][0] = capital[i]
                arr[i][1] = profits[i]
            }
            Arrays.sort(arr) { a, b -> a[0] - b[0] }
            var current = 0
            var tempW = w
            val pq = PriorityQueue<Int> { x, y -> y - x }
            for (i in 0 until k) {
                while (current < length && arr[current][0] <= tempW) {
                    pq.add(arr[current][1])
                    current += 1
                }
                if (pq.isNotEmpty()) {
                    tempW += pq.poll()
                } else {
                    break
                }
            }
            return tempW
        }
    }
}