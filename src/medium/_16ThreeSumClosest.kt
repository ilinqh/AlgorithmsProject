package medium

import java.util.*

class _16ThreeSumClosest {
class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        if (nums.size < 3) {
            return Int.MAX_VALUE
        }
        if (nums.size == 3) {
            return nums[0] + nums[1] + nums[2]
        }
        Arrays.sort(nums)
        var closestTarget = Int.MAX_VALUE
        var secondPointIndex: Int
        var thirdPointIndex: Int
        for (x in nums.indices) {
            if (x > 0 && nums[x] == nums[x - 1]) {
                continue
            }
            secondPointIndex = x + 1
            thirdPointIndex = nums.size - 1
            while (secondPointIndex < thirdPointIndex) {
                val delta = nums[x] + nums[secondPointIndex] + nums[thirdPointIndex] - target
                if (Math.abs(delta) < Math.abs(closestTarget - target)) {
                    closestTarget = nums[x] + nums[secondPointIndex] + nums[thirdPointIndex]
                    secondPointIndex++
                } else {
                    break
                }
            }
            for (y in secondPointIndex until nums.size) {
                if ((y - secondPointIndex) > 0 && nums[y] == nums[y - 1]) {
                    continue
                }
                while (y < thirdPointIndex) {
                    val delta = nums[x] + nums[y] + nums[thirdPointIndex] - target
                    if (Math.abs(delta) < Math.abs(closestTarget - target)) {
                        closestTarget = nums[x] + nums[secondPointIndex] + nums[thirdPointIndex]
                        thirdPointIndex--
                    } else {
                        break
                    }
                }
            }
        }

        return closestTarget
    }
}
}