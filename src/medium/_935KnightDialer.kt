package medium

class _935KnightDialer {
    class Solution {
        companion object {
            const val MOD: Int = 1000000007
        }

        fun knightDialer(n: Int): Int {
            var tempN = n
            var original = arrayOf(
                intArrayOf(0, 0, 0, 0, 1, 0, 1, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0, 0, 1, 0, 1, 0),
                intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 0, 1),
                intArrayOf(0, 0, 0, 0, 1, 0, 0, 0, 1, 0),
                intArrayOf(1, 0, 0, 1, 0, 0, 0, 0, 0, 1),
                intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                intArrayOf(1, 1, 0, 0, 0, 0, 0, 1, 0, 0),
                intArrayOf(0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
                intArrayOf(0, 1, 0, 1, 0, 0, 0, 0, 0, 0),
                intArrayOf(0, 0, 1, 0, 1, 0, 0, 0, 0, 0)
            )
            var res = arrayOf(
                intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
            )

            var original2 = Array(10) { IntArray(10) }
            for (i in 0..9) {
                original2[i][i] = 1
            }
            tempN--
            while (tempN > 0) {
                if ((tempN and 1) != 0) {
                    original2 = mul(original2, original)
                }
                original = mul(original, original)
                tempN = tempN shr 1
            }
            res = mul(res, original2)
            var ret = 0
            for (x in res[0]) {
                ret = (ret + x) % MOD
            }

            return ret
        }

        fun mul(lth: Array<IntArray>, rth: Array<IntArray>): Array<IntArray> {
            val res = Array(lth.size) { IntArray(rth[0].size) }
            for (k in lth[0].indices) {
                for (i in lth.indices) {
                    for (j in rth[0].indices) {
                        res[i][j] = ((res[i][j] + 1L * lth[i][k] * rth[k][j] % MOD) % MOD).toInt()
                    }
                }
            }
            return res
        }
    }

}