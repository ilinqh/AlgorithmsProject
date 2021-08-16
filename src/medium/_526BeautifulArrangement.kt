package medium

class _526BeautifulArrangement {
    class Solution {
        private lateinit var match: Array<ArrayList<Int>>
        private lateinit var vis: BooleanArray
        private var number: Int = 0

        fun countArrangement(n: Int): Int {
            vis = BooleanArray(n + 1)
            match = Array(n + 1) {
                ArrayList<Int>()
            }
            for (i in 1..n) {
                for (j in 1..n) {
                    if (i % j == 0 || j % i == 0) {
                        match[i].add(j)
                    }
                }
            }
            backtrace(1, n)
            return number
        }

        private fun backtrace(index: Int, n: Int) {
            if (index == n + 1) {
                number++
                return
            }
            for (x in match[index]) {
                if (!vis[x]) {
                    vis[x] = true
                    backtrace(index + 1, n)
                    vis[x] = false
                }
            }
        }
    }

    // Best 看不懂...

    class BestSolution {
        fun countArrangement(n: Int): Int {
            val f = IntArray(1 shl n)
            f[0] = 1
            for (mask in 1 until (1 shl n)) {
                val num = Integer.bitCount(mask)
                for (i in 0 until n) {
                    if (mask and (1 shl i) != 0 && (num % (i + 1) == 0 || (i + 1) % num == 0)) {
                        f[mask] += f[mask xor (1 shl i)]
                    }
                }
            }
            return f[(1 shl n) - 1]
        }
    }
}