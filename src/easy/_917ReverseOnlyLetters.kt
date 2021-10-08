package easy

class _917ReverseOnlyLetters {
    class Solution {
        fun reverseOnlyLetters(s: String): String {
            val length = s.length
            val array = s.toCharArray()
            var left = 0
            var right = length - 1
            while (left < right) {
                if (Character.isLetter(array[left]) && Character.isLetter(array[right])) {
                    swap(array, left, right)
                    left += 1
                    right -= 1
                } else if (!Character.isLetter(array[left])) {
                    left += 1
                } else if (!Character.isLetter(array[right])) {
                    right -= 1
                } else {
                    left += 1
                    right -= 1
                }
            }
            return String(array)
        }

        private fun swap(array: CharArray, i: Int, j: Int) {
            val temp = array[i]
            array[i] = array[j]
            array[j] = temp
        }
    }
}