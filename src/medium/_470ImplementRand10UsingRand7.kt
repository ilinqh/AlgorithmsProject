package medium

class _470ImplementRand10UsingRand7 {
    open class SolBase {
        fun rand7(): Int {
            return (Math.random() * 7).toInt()
        }
    }

    class Solution : SolBase() {
        fun rand10(): Int {
            var a: Int
            var b: Int
            var idx: Int
            while (true) {
                a = rand7()
                b = rand7()
                idx = b + (a - 1) * 7
                if (idx <= 40) {
                    return 1 + (idx - 1) % 10
                }
                a = idx - 40
                b = rand7()
                // get uniform dist from 1 - 63
                idx = b + (a - 1) * 7
                if (idx <= 60) {
                    return 1 + (idx - 1) % 10
                }
                a = idx - 60
                b = rand7()
                // get uniform dist from 1 - 21
                idx = b + (a - 1) * 7
                if (idx <= 20) {
                    return 1 + (idx - 1) % 10
                }
            }
        }
    }
}