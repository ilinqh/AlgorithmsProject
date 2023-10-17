package easy

class _2652SumMultiples {
    class Solution {
        fun sumOfMultiples(n: Int): Int {
            var result = 0
            var current = 3
            while (current <= n) {
                if (current % 3 == 0 || current % 5 == 0 || current % 7 == 0) {
                    result += current
                }
                current += 1
            }
            return result
        }
    }

    class BestSolution {
        private fun f(n: Int, m: Int): Int {
            return (m + n / m * m) * (n / m) / 2
        }

        fun sumOfMultiples(n: Int): Int {
            return f(n, 3) + f(n, 5) + f(n, 7) - f(n, 3 * 5) - f(n, 3 * 7) - f(n, 5 * 7) + f(n, 3 * 5 * 7)
        }
    }
}