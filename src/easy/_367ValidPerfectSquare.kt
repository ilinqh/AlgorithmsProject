package easy

class _367ValidPerfectSquare {
    class Solution {
        fun isPerfectSquare(num: Int): Boolean {
            var left = 0
            var right = num
            while (left <= right) {
                val mid = (right - left) / 2 + left
                val square = mid.toLong() * mid
                if (square < num) {
                    left = mid + 1
                } else if (square > num) {
                    right = mid - 1
                } else {
                    return true
                }
            }
            return false
        }
    }

}