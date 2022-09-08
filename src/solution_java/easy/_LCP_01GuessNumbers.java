package solution_java.easy;

public class _LCP_01GuessNumbers {
    public class Solution {
        public int game(int[] guess, int[] answer) {
            int ans = 0;
            for (int i = 0; i < 3; i++) {
                if (guess[i] == answer[i]) {
                    ans += 1;
                }
            }
            return ans;
        }
    }
}
