package medium

class _3001MinimumMovesToCaptureTheQueen {
    class Solution {
        fun minMovesToCaptureTheQueen(a: Int, b: Int, c: Int, d: Int, e: Int, f: Int): Int {
            if (a == e && (a != c || d < Math.min(b, f) || d > Math.max(b, f))) {
                return 1
            }
            if (b == f && (b != d || c < Math.min(a, e) || c > Math.max(a, e))) {
                return 1
            }
            if (Math.abs(c - e) == Math.abs(d - f) &&
                ((c - e) * (b - f) != (a - e) * (d - f) || a < Math.min(c, e) || a > Math.max(c, e))
            ) {
                return 1
            }
            return 2
        }
    }
}