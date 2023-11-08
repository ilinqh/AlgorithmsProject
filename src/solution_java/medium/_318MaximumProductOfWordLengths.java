package solution_java.medium;

public class _318MaximumProductOfWordLengths {
    public class Solution {
        public int maxProduct(String[] words) {
            int size = words.length;
            int[] masks = new int[size];
            for (int j = 0; j < size; j++) {
                String word = words[j];
                int mask = 0;
                for (int i = 0; i < word.length(); i++) {
                    char ch = word.charAt(i);
                    mask = mask | (1 << (ch - 'a'));
                }
                masks[j] = mask;
            }
            int result = 0;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < i; j++) {
                    if ((masks[j] & masks[i]) == 0) {
                        result = Math.max(result, words[j].length() * words[i].length());
                    }
                }
            }
            return result;
        }
    }
}
