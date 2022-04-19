package solution_java.easy;

public class _169MajorityElement {
    public class Solution {
        public int majorityElement(int[] nums) {
            int ans = nums[0];
            int count = 1;
            for (int i = 1; i < nums.length; i++) {
                if (count == 0) {
                    ans = nums[i];
                }
                if (ans == nums[i]) {
                    count += 1;
                } else {
                    count -= 1;
                }
            }
            return ans;
        }
    }
}
