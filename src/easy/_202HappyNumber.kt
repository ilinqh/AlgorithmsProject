package easy

class _202HappyNumber {
    class Solution {
        fun isHappy(n: Int): Boolean {
            var tempN = n
            val set = HashSet<Int>()
            while (tempN != 1 && !set.contains(tempN)) {
                set.add(tempN)
                tempN = getNext(tempN)
            }
            return tempN == 1
        }

        private fun getNext(n: Int): Int {
            var tempN = n
            var ans = 0
            while (tempN > 0) {
                val d = tempN % 10
                ans += d * d
                tempN /= 10
            }
            return ans
        }
    }
}