package coding_interviews

class OfferII_069B1IidL {
    class Solution {
        fun peakIndexInMountainArray(arr: IntArray): Int {
            var left = 1
            var right = arr.size - 2
            var ans = 0
            while (left <= right) {
                val middle = left + ((right - left) shr 1)
                if (arr[middle] > arr[middle + 1]) {
                    ans = middle
                    right = middle - 1
                } else {
                    left = middle + 1
                }
            }
            return ans
        }
    }
}