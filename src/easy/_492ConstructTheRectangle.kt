package easy

class _492ConstructTheRectangle {
    class Solution {
        fun constructRectangle(area: Int): IntArray {
            var num = Math.sqrt(area.toDouble()).toInt()
            while (area % num != 0) {
                num -= 1
            }
            return intArrayOf(area / num, num)
        }
    }
}