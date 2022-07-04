package solution_java.medium;

public class _36ValidSudoku {
    public class Solution {
        public boolean isValidSudoku(char[][] board) {
            int[] row = new int[9];
            int[] column = new int[9];
            int[] boxes = new int[9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] == '.') {
                        continue;
                    }
                    int boxIndex = i / 3 * 3 + j / 3;
                    int count = board[i][j] - '0';
                    if ((row[i] >> count & 1) == 1 || (column[j] >> count & 1) == 1 || (boxes[boxIndex] >> count & 1) == 1) {
                        return false;
                    }
                    row[i] = row[i] | (1 << count);
                    column[j] = column[j] | (1 << count);
                    boxes[boxIndex] = boxes[boxIndex] | (1 << count);
                }
            }
            return true;
        }
    }
}
