package easy

class _292NimGame {
    class Solution {
        fun canWinNim(n: Int): Boolean {
            // (n and 3) != 0 等价于 n % 4 != 0
            return n % 4 != 0
        }
    }
}