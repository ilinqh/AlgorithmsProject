package solution_java.medium;

import java.util.ArrayList;
import java.util.List;

public class _89GrayCode {
    public class Solution {
        public List<Integer> grayCode(int n) {
            List<Integer> result = new ArrayList<>();
            result.add(0);
            for (int i = 1; i <= n; i++) {
                int length = result.size();
                for (int j = length - 1; j >= 0; j--) {
                    result.add(result.get(j) | (1 << (i - 1)));
                }
            }
            return result;
        }
    }
}
