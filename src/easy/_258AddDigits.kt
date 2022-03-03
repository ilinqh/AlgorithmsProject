package easy

class _258AddDigits {
    class Solution {
        fun addDigits(num: Int): Int {
            if (num < 10) {
                return num
            }
            var ans = 0
            var tempNum = num
            while (tempNum >= 10) {
                ans += (tempNum % 10)
                tempNum /= 10
                if (tempNum < 10) {
                    ans += tempNum
                    tempNum = ans
                    if (tempNum >= 10) {
                        ans = 0
                    }
                }
            }
            return ans
        }
    }

    class OtherSolution {
        fun addDigits(num: Int): Int {
            var tempNum = num
            while (tempNum >= 10) {
                var sum = 0
                while (tempNum > 0) {
                    sum += tempNum % 10
                    tempNum /= 10
                }
                tempNum = sum
            }
            return tempNum
        }
    }

    class BestSolution {
        fun addDigits(num: Int): Int {
            return (num - 1) % 9 + 1
        }
    }
}