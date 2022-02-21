package medium

class _838PushDominoes {
    class Solution {
        fun pushDominoes(dominoes: String): String {
            val arr = dominoes.toCharArray()
            val length = dominoes.length
            var i = 0
            var left = 'L'
            while (i < length) {
                var j = i
                while (j < length && dominoes[j] == '.') {
                    j += 1
                }
                val right = if (j < length) {
                    dominoes[j]
                } else {
                    'R'
                }
                if (left == right) {
                    while (i < j) {
                        arr[i++] = right
                    }
                } else if (left == 'R' && right == 'L') {
                    var k = j - 1
                    while (i < k) {
                        arr[i++] = left
                        arr[k--] = right
                    }
                }
                left = right
                i = j + 1
            }
            return String(arr)
        }
    }
}