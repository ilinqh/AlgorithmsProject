package medium

class _371SumOfTwoIntegers {
    class Solution {
        fun getSum(a: Int, b: Int): Int {
            var ans = 0
            var t = 0
            for (i in 0 until 32) {
                val u1 = (a shr i) and 1
                val u2 = (b shr i) and 1
                if (u1 == 1 && u2 == 1) {
                    ans = ans or (t shl i)
                    t = 1
                } else if (u1 == 1 || u2 == 1) {
                    ans = ans or ((1 xor t) shl i)
                } else {
                    ans = ans or (t shl i)
                    t = 0
                }
            }
            return ans
        }
    }

    class BestSolution {
        fun getSum(a: Int, b: Int): Int {
            return if (b == 0) {
                a
            } else {
                getSum(a xor b, (a and b) shl 1)
            }
        }
    }
}