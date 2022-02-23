package solution_java.easy;

public class _917ReverseOnlyLetters {
    public class Solution {
        public String reverseOnlyLetters(String s) {
            char[] array =  s.toCharArray();
            int length = s.length();
            int left = 0, right = length - 1;
            while (left < right) {
                if (Character.isLetter(array[left]) && Character.isLetter(array[right])) {
                    swap(array, left, right);
                    left += 1;
                    right -= 1;
                } else if (!Character.isLetter(array[left])) {
                    left += 1;
                } else if (!Character.isLetter(array[right])) {
                    right -= 1;
                } else {
                    left += 1;
                    right -= 1;
                }
            }
            return new String(array);
        }

        private void swap(char[] array, int i, int j) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
