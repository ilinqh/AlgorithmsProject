package solution_java.easy;

public class _661ImageSmoother {
    public class Solution {
        public int[][] imageSmoother(int[][] img) {
            int row = img.length;
            int column = img[0].length;
            int[][] result = new int[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    int count = 0;
                    int sum = 0;
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (k >= 0 && k < row && l >= 0 && l < column) {
                                count += 1;
                                sum += img[k][l];
                            }
                        }
                    }
                    result[i][j] = sum / count;
                }
            }
            return result;
        }
    }
}