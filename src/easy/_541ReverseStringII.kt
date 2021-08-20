package easy

class _541ReverseStringII {
    class Solution {
        fun reverseStr(s: String, k: Int): String {
            val arr = s.toCharArray()
            var length = arr.size
            for (i in 0 until length step (2 * k)) {
                reverse(arr, i, Math.min(i + k, length) - 1)
            }
            return String(arr)
        }

        private fun reverse(arr: CharArray, tempLeft: Int, tempRight: Int) {
            var left = tempLeft
            var right = tempRight
            while (left < right) {
                val temp = arr[left]
                arr[left] = arr[right]
                arr[right] = temp
                left++
                right--
            }
        }
    }
}