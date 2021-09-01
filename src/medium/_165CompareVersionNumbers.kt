package medium

class _165CompareVersionNumbers {
    class Solution {
        fun compareVersion(version1: String, version2: String): Int {
            val length1 = version1.length
            val length2 = version2.length
            var first = 0
            var second = 0
            while (first < length1 || second < length2) {
                var x = 0
                while (first < length1 && version1[first] != '.') {
                    x = x * 10 + (version1[first] - '0')
                    first++
                }
                first++
                var y = 0
                while (second < length2 && version2[second] != '.') {
                    y = y * 10 + (version2[second] - '0')
                    second++
                }
                second++
                if (x > y) {
                    return 1
                } else if (x < y) {
                    return -1
                }
            }
            return 0
        }
    }
}