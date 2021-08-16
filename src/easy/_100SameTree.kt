package easy

import TreeNode

class _100SameTree {
    class Solution {
        fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
            if (p == null && q == null) {
                return true
            } else if (p == null || q == null) {
                return false
            } else if (p.`val` != q.`val`) {
                return false
            }
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
        }
    }
}