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

    // Best

    class BestSolution {
        private fun dfs(p: TreeNode?, q: TreeNode?): Boolean {
            return if (p != null && q != null) {
                if (p.`val` == q.`val`) {
                    dfs(p.left, q.left) && dfs(p.right, q.right)
                } else {
                    false
                }
            } else {
                p == q
            }
        }

        fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
            return dfs(p, q)

        }
    }
}