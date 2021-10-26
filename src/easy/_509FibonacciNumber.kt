package easy

class _509FibonacciNumber {
    class Solution {
        fun fib(n: Int): Int {
            if (n == 0) {
                return 0
            }
            if (n == 1) {
                return 1
            }
            var a = 0
            var b = 1
            var c = 1
            for (i in 2..n) {
                c = a + b
                a = b
                b = c
            }
            return c
        }
    }
}