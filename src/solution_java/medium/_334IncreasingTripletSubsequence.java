package solution_java.medium;

public class _334IncreasingTripletSubsequence {
    public class Solution {
        public boolean increasingTriplet(int[] nums) {
            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                int item = nums[i];
                if (item <= first) {
                    first = item;
                } else if (item <= second) {
                    second = item;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
