package medium

class _223RectangleArea {
    class Solution {
        fun computeArea(
            ax1: Int, ay1: Int, ax2: Int, ay2: Int,
            bx1: Int, by1: Int, bx2: Int, by2: Int
        ): Int {
            val area1 = (ax2 - ax1) * (ay2 - ay1)
            val area2 = (bx2 - bx1) * (by2 - by1)
            val overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1)
            val overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1)
            val overlapArea = Math.max(overlapWidth, 0) * Math.max(overlapHeight, 0)
            return area1 + area2 - overlapArea
        }
    }
}