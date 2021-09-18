package easy

class _292NimGame {
    class Solution {
        fun canWinNim(n: Int): Boolean {
            // a % b 时，如果 b 为 2 的 n 次方，则可通过位运算替换取模预算
            // a % b = a & (b - 1)[b = 2 的 n 次方] 即：a % (2 的 n 次方) = a & ((2 的 n 次方) - 1)
            // (n and 3) != 0 等价于 n % 4 != 0
            return n % 4 != 0
        }
    }
}