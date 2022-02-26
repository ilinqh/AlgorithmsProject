package medium

class _1053PreviousPermutationWithOneSwap {
class Solution {
    fun prevPermOpt1(arr: IntArray): IntArray {
        for (i in (arr.size - 1) downTo 1) {
            var isBreak = false
            for (j in (i - 1) downTo 0) {
                if (arr[i] < arr[j]) {
                    val temp = arr[i]
                    arr[i] = arr[j]
                    arr[j] = temp
                    isBreak = true
                    break
                }
            }
            if (isBreak) {
                break
            }
        }
        return arr
    }
}
}