package easy

class _2582PassThePillow {
    class Solution {
        fun passThePillow(n: Int, time: Int): Int {
            val step = n - 1
            val remainder = time % step
            val count = time / step
            return if (count % 2 == 0) {
                remainder + 1
            } else {
                n - remainder
            }
        }
    }
}