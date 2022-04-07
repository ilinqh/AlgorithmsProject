package easy

class _796RotateString {
    class Solution {
        fun rotateString(s: String, goal: String): Boolean {
            val m = s.length
            val n = goal.length
            if (m != n) {
                return false
            }
            val newS = s + s
            return newS.contains(goal)
        }
    }
}