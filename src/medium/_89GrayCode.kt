package medium

class _89GrayCode {
    class Solution {
        fun grayCode(n: Int): List<Int> {
            val result = ArrayList<Int>()
            result.add(0)
            for (i in 0 until n) {
                val high = 1 shl i
                val length = result.size - 1
                for (j in length downTo 0) {
                    val newItem = high + result[j]
                    result.add(newItem)
                }
            }
            return result
        }
    }
}