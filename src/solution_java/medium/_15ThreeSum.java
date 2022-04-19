package solution_java.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _15ThreeSum {
    public class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
            if (n < 3) {
                return Collections.emptyList();
            }
            Arrays.sort(nums);
            ArrayList<List<Integer>> ans = new ArrayList<>();
            for (int first = 0; first < n - 2; first++) {
                if (first > 0 && nums[first] == nums[first - 1]) {
                    continue;
                }
                int third = n - 1;
                int target = -nums[first];
                for (int second = first + 1; second < n - 1; second++) {
                    if (second > first + 1 && nums[second] == nums[second - 1]) {
                        continue;
                    }
                    while (second < third && nums[second] + nums[third] > target) {
                        third -= 1;
                    }
                    if (second == third) {
                        break;
                    }
                    if (nums[second] + nums[third] == target) {
                        ArrayList<Integer> item = new ArrayList<>();
                        item.add(nums[first]);
                        item.add(nums[second]);
                        item.add(nums[third]);
                        ans.add(item);
                    }
                }
            }
            return ans;
        }
    }
}
