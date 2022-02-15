package medium

class _1447SimplifiedFractions {
    class Solution {
        fun simplifiedFractions(n: Int): List<String> {
            val ans = ArrayList<String>()
            for (i in 2..n) {
                for (j in 1 until i) {
                    if (gcd(i, j) == 1) {
                        ans.add("${j}/${i}")
                    }
                }
            }
            return ans
        }

        private fun gcd(a: Int, b: Int): Int {
            return if (b == 0) {
                a
            } else {
                gcd(b, a % b)
            }
        }
    }
}