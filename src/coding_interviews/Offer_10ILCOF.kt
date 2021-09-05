package coding_interviews

class Offer_10ILCOF {
    class Solution {
        fun fib(n: Int): Int {
            if (n < 2) {
                return n
            }
            val mod = 1000000007
            var p = 0
            var q = 0
            var result = 1
            for (i in 2..n) {
                p = q
                q = result
                result = (p + q) % mod
            }
            return result
        }
    }

    class BestSolution {
        private val mod = 1000000007

        fun fib(n: Int): Int {
            if (n < 2) {
                return n
            }
            val q = Array(2) {
                IntArray(2)
            }
            q[0] = intArrayOf(1, 1)
            q[1] = intArrayOf(1, 0)
            val res = pow(q, n - 1)
            return res[0][0]
        }

        private fun pow(tempA: Array<IntArray>, tempN: Int): Array<IntArray> {
            var ret = Array(2) {
                IntArray(2)
            }
            ret[0] = intArrayOf(1, 0)
            ret[1] = intArrayOf(0, 1)
            var n = tempN
            var a = tempA
            while (n > 0) {
                if ((n and 1) == 1) {
                    ret = multiply(ret, a)
                }

                n = n shr 1
                a = multiply(a, a)
            }
            return ret
        }

        private fun multiply(a: Array<IntArray>, b: Array<IntArray>): Array<IntArray> {
            val c = Array<IntArray>(2) {
                IntArray(2)
            }
            for (i in 0 until 2) {
                for (j in 0 until 2) {
                    c[i][j] = ((a[i][0].toLong() * b[0][j] + a[i][1].toLong() * b[1][j]) % mod).toInt()
                }
            }
            return c
        }
    }
}