package easy

class _1710MaximumUnitsOnATruck {
    class Solution {
        fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
            boxTypes.sortByDescending {
                it[1]
            }
            var tempSize = truckSize
            var ans = 0
            for (boxes in boxTypes) {
                val boxSize = boxes[0]
                for (i in 0 until boxSize) {
                    if (tempSize <= 0) {
                        break
                    }
                    ans += boxes[1]
                    tempSize -= 1
                }
            }
            return ans
        }
    }
}