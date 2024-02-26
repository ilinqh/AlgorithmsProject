package easy

import TreeNode

class _938RangeSumOfBst {
    class Solution {
        fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
            root ?: return 0
            if (root.`val` < low) {
                return rangeSumBST(root.right, low, high)
            } else if (root.`val` > high) {
                return rangeSumBST(root.left, low, high)
            }
            return root.`val` + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high)
        }
    }
}