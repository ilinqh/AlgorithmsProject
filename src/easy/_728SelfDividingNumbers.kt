package easy

class _728SelfDividingNumbers {
    class Solution {
        fun selfDividingNumbers(left: Int, right: Int): List<Int> {
            val ans = ArrayList<Int>()
            for (i in left..right) {
                if (isSelfDivide(i)) {
                    ans.add(i)
                }
            }
            return ans
        }

        private fun isSelfDivide(num: Int): Boolean {
            var temp = num
            while (temp != 0) {
                val last = temp % 10
                if (last == 0 || num % last != 0) {
                    return false
                }
                temp /= 10
            }
            return true
        }
    }
}