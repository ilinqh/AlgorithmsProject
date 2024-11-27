package medium

class _3208AlternatingGroupsIi {
    class Solution {
        fun numberOfAlternatingGroups(colors: IntArray, k: Int): Int {
            var result = 0
            val size = colors.size
            var temp = 1
            for (i in -k + 2 until size) {
                if (colors[(i + size) % size] != colors[(i - 1 + size) % size]) {
                    temp += 1
                } else {
                    temp = 1
                }
                if (temp >= k) {
                    result += 1
                }
            }
            return result
        }
    }
}