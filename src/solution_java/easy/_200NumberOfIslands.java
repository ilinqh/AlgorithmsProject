package solution_java.easy;

public class _200NumberOfIslands {
    public class Solution {
        public int numIslands(char[][] grid) {
            int ans = 0;
            int rowCount = grid.length;
            int columnCount = grid[0].length;
            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < columnCount; j++) {
                    if (grid[i][j] == '1') {
                        ans += 1;
                        dfs(grid, rowCount, columnCount, i, j);
                    }
                }
            }
            return ans;
        }

        private void dfs(char[][] grid, int rowCount, int columnCount, int i, int j) {
            if (i < 0 || i >= rowCount || j < 0 || j >= columnCount || grid[i][j] == '0') {
                return;
            }
            grid[i][j] = '0';
            dfs(grid, rowCount, columnCount, i - 1, j);
            dfs(grid, rowCount, columnCount, i + 1, j);
            dfs(grid, rowCount, columnCount, i, j - 1);
            dfs(grid, rowCount, columnCount, i, j + 1);
        }
    }
}
