package easy

class _859BuddyStrings {
    class Solution {
        fun buddyStrings(s: String, goal: String): Boolean {
            if (s.length != goal.length) {
                return false
            }
            if (s == goal) {
                val count = IntArray(26)
                for (i in s.indices) {
                    count[s[i] - 'a'] += 1
                    if (count[s[i] - 'a'] > 1) {
                        return true
                    }
                }
                return false
            } else {
                var first = -1
                var second = -1
                for (i in s.indices) {
                    if (s[i] != goal[i]) {
                        if (first == -1) {
                            first = i
                        } else if (second == -1) {
                            second = i
                        } else {
                            return false
                        }
                    }
                }
                return second != -1 && s[first] == goal[second] && s[second] == goal[first]
            }
        }
    }
}