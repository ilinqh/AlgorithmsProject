package medium

class _1053PreviousPermutationWithOneSwap {
    class Solution {
        fun prevPermOpt1(arr: IntArray): IntArray {
            var curMax = -1
            var index = -1
            var hasResult = false
            for (i in (arr.size - 2) downTo 0) {
                if (arr[i + 1] < arr[i]) {
                    for (j in (i + 1) until arr.size) {
                        if (arr[i] > arr[j]) {
                            hasResult = true
                            if (arr[j] > curMax) {
                                curMax = arr[j]
                                index = j
                            }
                        }
                    }
                    if (hasResult) {
                        val temp = arr[i]
                        arr[i] = arr[index]
                        arr[index] = temp
                        return arr
                    }
                }
            }
            return arr
        }
    }
}