package medium

class _2029StoneGameIx {
    class Solution {
        fun stoneGameIX(stones: IntArray): Boolean {
            var cnt0 = 0
            var cnt1 = 0
            var cnt2 = 0
            for (i in stones.indices) {
                val item = stones[i]
                val type = item % 3
                when (type) {
                    0 -> {
                        cnt0 += 1
                    }
                    1 -> {
                        cnt1 += 1
                    }
                    2 -> {
                        cnt2 += 2
                    }
                }
            }
            if (cnt0 % 2 == 0) {
                return cnt1 >= 1 && cnt2 >= 1
            }
            return cnt1 - cnt2 > 2 || cnt2 - cnt1 > 2
        }
    }
}