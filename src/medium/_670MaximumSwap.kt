package medium

class _670MaximumSwap {
    class Solution {
        fun maximumSwap(num: Int): Int {
            var tempNum = num
            val array = ArrayList<Int>()
            while (tempNum > 0) {
                val temp = tempNum % 10
                array.add(temp)
                tempNum /= 10
            }
            val size = array.size
            for (i in (size - 1) downTo 1) {
                var max = array[i]
                var maxIndex = i
                for (j in (i - 1) downTo 0) {
                    if (array[j] > max || (array[j] == max && maxIndex != i)) {
                        maxIndex = j
                        max = array[j]
                    }
                }
                if (maxIndex != i) {
                    val temp = array[i]
                    array[i] = max
                    array[maxIndex] = temp
                    break
                }
            }
            var result = 0
            for (index in (array.size - 1) downTo 0) {
                result = result * 10 + array[index]
            }
            return result
        }
    }
}