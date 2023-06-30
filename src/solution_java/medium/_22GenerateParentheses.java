package solution_java.medium;

import java.util.ArrayList;
import java.util.List;

public class _22GenerateParentheses {
    public class Solution {

        private List<String> result = new ArrayList<>();

        public List<String> generateParenthesis(int n) {
            dps("(", n - 1, n);
            return result;
        }

        private void dps(String str, int left, int right) {
            if (left == 0 && right == 0) {
                result.add(str);
            }
            if (left > right) {
                return;
            }
            if (left > 0) {
                dps(str + "(", left - 1, right);
            }
            if (right > 0) {
                dps(str + ")", left, right - 1);
            }
        }
    }
}
