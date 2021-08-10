package medium

class _11ContainerWithMostWater {
    // 可以使用#动态规划的思路，但是时间复杂度是 O(n²) 会超时，所以这一题比较合适的解法是#双指针
    class Solution {
        fun maxArea(height: IntArray): Int {
            var maxArea = 0
            var i = 0
            var j = height.size - 1
            while (j > i) {
                maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i))
                if (height[i] > height[j]) {
                    j--
                } else {
                    i++
                }
            }
            return maxArea
        }
    }
}