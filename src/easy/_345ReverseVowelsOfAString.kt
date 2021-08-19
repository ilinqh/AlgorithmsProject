package easy

class _345ReverseVowelsOfAString {
    class Solution {
        fun reverseVowels(s: String): String {
            if (s.length < 2) {
                return s
            }
            val arr = s.toCharArray()
            var left = 0
            var right = s.length - 1
            while (left < right) {
                while (left < s.length && !isVowels(arr[left])) {
                    left++
                }
                while (right > 0 && !isVowels(arr[right])) {
                    right--
                }
                if (left < right) {
                    swap(arr, left++, right--)
                }
            }
            return String(arr)
        }

        private fun isVowels(ch: Char): Boolean {
            return "aeiouAEIOU".indexOf(ch) >= 0
        }

        private fun swap(arr: CharArray, index1: Int, index2: Int) {
            val temp = arr[index1]
            arr[index1] = arr[index2]
            arr[index2] = temp
        }
    }
}