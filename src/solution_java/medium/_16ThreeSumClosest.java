package solution_java.medium;

import java.util.Arrays;

public class _16ThreeSumClosest {
    public class Solution {
        public int threeSumClosest(int[] nums, int target) {
            if (nums.length == 3) {
                return nums[0] + nums[1] + nums[2];
            }
            int closeTarget = 100000;
            Arrays.sort(nums);
            int secondIndex;
            int thirdIndex;
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                secondIndex = i + 1;
                thirdIndex = nums.length - 1;
                while (secondIndex < thirdIndex) {
                    int sum = nums[i] + nums[secondIndex] + nums[thirdIndex];
                    if (sum == target) {
                        return sum;
                    }
                    int delta = sum - target;
                    if (Math.abs(delta) < Math.abs(closeTarget - target)) {
                        closeTarget = sum;
                    }

                    if (sum > target) {
                        int tempThird = thirdIndex - 1;
                        while (secondIndex < tempThird && nums[tempThird] == nums[thirdIndex]) {
                            tempThird -= 1;
                        }
                        thirdIndex = tempThird;
                    } else {
                        int tempSecond = secondIndex + 1;
                        while (tempSecond < thirdIndex && nums[tempSecond] == nums[secondIndex]) {
                            tempSecond += 1;
                        }
                        secondIndex = tempSecond;
                    }
                }
            }
            return closeTarget;
        }
    }
}
