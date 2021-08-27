package easy

class _231PowerOfTwo {
    class Solution {
        fun isPowerOfTwo(n: Int): Boolean {
            return n > 0 && (n and (n - 1) == 0)
        }
    }
}