package easy

class _69SqrtX {
class Solution {
    fun mySqrt(x: Int): Int {
        if (x < 2) {
            return x
        }
        var left = 1
        var right = x
        var ans = 0
        while (left <= right) {
            val middle = left + (right - left) / 2
            if (x / middle >= middle) {
                ans = middle
                left = middle + 1
            } else {
                right = middle - 1
            }
        }
        return ans
    }
}
}