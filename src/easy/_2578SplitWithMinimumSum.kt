package easy

class _2578SplitWithMinimumSum {
    class Solution {
        fun splitNum(num: Int): Int {
            var tempNum = num
            val list = arrayListOf<Int>()
            while (tempNum > 0) {
                list.add(tempNum % 10)
                tempNum /= 10
            }
            list.sortWith { a, b ->
                a - b
            }
            var i = 0
            var num1 = 0
            var num2 = 0
            while (i < list.size) {
                if (i % 2 == 0) {
                    num1 = num1 * 10 + list[i]
                } else {
                    num2 = num2 * 10 + list[i]
                }
                i += 1
            }
            return num1 + num2
        }
    }
}