package solution_java.medium;

public class _172FactorialTrailingZeroes {
    public class BadSolution {
        public int trailingZeroes(int n) {
            int result = 0;
            for (int i = 1; i <= n; i++) {
                int temp = i;
                while (temp % 5 == 0) {
                    result += 1;
                    temp /= 5;
                }
            }
            return result;
        }
    }

    public class Solution {
        public int trailingZeroes(int n) {
            int ans = 0;
            while (n != 0) {
                n /= 5;
                ans += n;
            }
            return ans;
        }
    }
}
