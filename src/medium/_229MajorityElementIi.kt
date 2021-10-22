package medium

class _229MajorityElementIi {
    class Solution {
        fun majorityElement(nums: IntArray): List<Int> {
            var element1 = 0
            var element2 = 0
            var vote1 = 0
            var vote2 = 0
            for (num in nums) {
                if (vote1 > 0 && num == element1) {
                    vote1 += 1
                } else if (vote2 > 0 && num == element2) {
                    vote2 += 1
                } else if (vote1 == 0) {
                    element1 = num
                    vote1 += 1
                } else if (vote2 == 0) {
                    element2 = num
                    vote2 += 1
                } else {
                    vote1 -= 1
                    vote2 -= 1
                }
            }
            var count1 = 0
            var count2 = 0
            for (num in nums) {
                if (vote1 > 0 && num == element1) {
                    count1 += 1
                } else if (vote2 > 0 && num == element2) {
                    count2 += 1
                }
            }
            val ans = ArrayList<Int>()
            if (count1 > nums.size / 3) {
                ans.add(element1)
            }
            if (count2 > nums.size / 3) {
                ans.add(element2)
            }
            return ans
        }
    }
}