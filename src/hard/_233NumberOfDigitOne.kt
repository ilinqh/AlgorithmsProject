package hard

class _233NumberOfDigitOne {
    class Solution {
        fun countDigitOne(n: Int): Int {
            return 0
        }
    }

    class BestSolution {
        fun countDigitOne(n: Int): Int {
            // mulk 表示 10^k
            // 在下面的代码中，可以发现 k 并没有被直接使用到（都是使用 10^k）
            // 但为了让代码看起来更加直观，这里保留了 k
            var mulk: Long = 1
            var ans = 0
//            var k = 0

            while (n >= mulk) {
                val max = Math.max(n % (mulk * 10) - mulk + 1, 0)
                val min = Math.min(max, mulk)
                val what = n / (mulk * 10) * mulk
                ans += (n / (mulk * 10) * mulk + Math.min(Math.max(n % (mulk * 10) - mulk + 1, 0), mulk)).toInt()
                mulk *= 10
//                ++k
            }
            return ans
        }
    }
}