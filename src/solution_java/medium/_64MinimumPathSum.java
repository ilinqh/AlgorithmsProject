package solution_java.medium;

public class _64MinimumPathSum {
    public class Solution {
        public int minPathSum(int[][] grid) {
            int row = grid.length;
            int column = grid[0].length;
            int[] dp = new int[column];
            dp[0] = grid[0][0];
            for (int i = 1; i < column; i++) {
                dp[i] = dp[i - 1] + grid[0][i];
            }
            int last;
            for (int i = 1; i < row; i++) {
                last = dp[0] + grid[i][0];
                dp[0] = last;
                for (int j = 1; j < column; j++) {
                    dp[j] = Math.min(last, dp[j]) + grid[i][j];
                    last = dp[j];
                }
            }
            return dp[column - 1];
        }
    }
}
