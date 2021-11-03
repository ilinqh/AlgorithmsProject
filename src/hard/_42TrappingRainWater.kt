package hard

class _42TrappingRainWater {
    class Solution {
        fun trap(height: IntArray): Int {
            var left = 0
            var right = height.size - 1
            var leftMax = 0
            var rightMax = 0
            var result = 0
            while (left < right) {
                leftMax = Math.max(leftMax, height[left])
                rightMax = Math.max(rightMax, height[right])
                if (leftMax < rightMax) {
                    result += leftMax - height[left]
                    left += 1
                } else {
                    result += rightMax - height[right]
                    right -= 1
                }
            }
            return result
        }
    }
}