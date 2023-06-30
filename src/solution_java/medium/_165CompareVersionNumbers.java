package solution_java.medium;

public class _165CompareVersionNumbers {
    public class Solution {
        public int compareVersion(String version1, String version2) {
            int length1 = version1.length();
            int length2 = version2.length();
            int first = 0;
            int second = 0;
            while (first < length1 || second < length2) {
                int x = 0;
                while (first < length1 && version1.charAt(first) != '.') {
                    x = x * 10 + (version1.charAt(first) - '0');
                    first += 1;
                }
                first += 1;
                int y = 0;
                while (second < length2 && version2.charAt(second) != '.') {
                    y = y * 10 + (version2.charAt(second) - '0');
                    second += 1;
                }
                second += 1;
                if (x > y) {
                    return 1;
                } else if (x < y) {
                    return -1;
                }
            }
            return 0;
        }
    }
}
