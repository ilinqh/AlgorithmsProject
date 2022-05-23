package solution_java.easy;

public class _69Sqrtx {
public class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 0;
        int right = x;
        int ans = 0;
        while (left <= right) {
            int middle = ((right - left) >> 1) + left;
            if (x / middle >= middle) {
                ans = middle;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return ans;
    }
}
}
