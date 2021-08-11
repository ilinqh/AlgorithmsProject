package medium

import java.util.*

class _16ThreeSumClosest {
class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        if (nums.size < 3) {
            return 1000000
        }
        if (nums.size == 3) {
            return nums[0] + nums[1] + nums[2]
        }
        Arrays.sort(nums)
        var closestTarget = 1000000
        var secondPointIndex: Int
        var thirdPointIndex: Int
        for (x in nums.indices) {
            if (x > 0 && nums[x] == nums[x - 1]) {
                continue
            }
            secondPointIndex = x + 1
            thirdPointIndex = nums.size - 1
            while (secondPointIndex < thirdPointIndex) {
                val sum = nums[x] + nums[secondPointIndex] + nums[thirdPointIndex]
                if (sum == target) {
                    return sum
                }
                val delta = nums[x] + nums[secondPointIndex] + nums[thirdPointIndex] - target
                if (Math.abs(delta) < Math.abs(closestTarget - target)) {
                    closestTarget = sum
                }
                if (sum > target) {
                    var tempThird = thirdPointIndex - 1
                    while (tempThird > secondPointIndex && nums[tempThird] == nums[thirdPointIndex]) {
                        tempThird--
                    }
                    thirdPointIndex = tempThird
                } else {
                    var tempSecond = secondPointIndex + 1
                    while (tempSecond < thirdPointIndex && nums[tempSecond] == nums[secondPointIndex]) {
                        tempSecond++
                    }
                    secondPointIndex = tempSecond
                }
            }
        }
        return closestTarget
    }
}
}