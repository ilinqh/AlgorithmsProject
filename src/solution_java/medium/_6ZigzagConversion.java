package solution_java.medium;

public class _6ZigzagConversion {
    public class Solution {
        public String convert(String s, int numRows) {
            if (numRows == 1) {
                return s;
            }
            int length = s.length();
            int internal = numRows - 1;
            char[] arr = s.toCharArray();
            int index = 0;
            char[] result = new char[length];
            for (int i = 0; i < numRows; i++) {
                int j = i;
                while (j < length) {
                    result[index] = arr[j];
                    j += 2 * (internal - j % internal);
                    index += 1;
                }
            }
            return new String(result);
        }
    }
}
