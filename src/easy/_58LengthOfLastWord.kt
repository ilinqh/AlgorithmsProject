package easy

class _58LengthOfLastWord {
    class Solution {
        fun lengthOfLastWord(s: String): Int {
            if (s.isEmpty()) {
                return 0
            }
            val array = s.split(' ')
            for (i in (array.size - 1) downTo 0) {
                if (array[i].isNotEmpty()) {
                    return array[i].length
                }
            }
            return 0
        }
    }

    class BestSolution {
        fun lengthOfLastWord(s: String): Int {
            var end = s.length - 1
            while (end >= 0 && s[end] == ' ') end--
            if (end < 0) return 0
            var start = end
            while (start >= 0 && s[start] != ' ') start--
            return end - start
        }
    }

}