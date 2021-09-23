package easy

class _326PowerOfThree {
    class Solution {
        fun isPowerOfThree(n: Int): Boolean {
            var tempN = n
            while (tempN != 0 && tempN % 3 == 0) {
                tempN /= 3
            }
            return tempN == 1
        }
    }

    class BestSolution {
        fun isPowerOfThree(n: Int): Boolean {
            return n > 0 && 1162261467 % n == 0
        }
    }

}