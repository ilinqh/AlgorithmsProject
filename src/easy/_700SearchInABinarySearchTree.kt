package easy

import TreeNode

class _700SearchInABinarySearchTree {
    class BadSolution {
        fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
            if (root == null) {
                return null
            }
            val value = root.`val`
            return if (value == `val`) {
                root
            } else if (value > `val`) {
                searchBST(root.left, `val`)
            } else {
                searchBST(root.right, `val`)
            }
        }
    }

    class Solution {
        fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
            var tempRoot = root
            while (tempRoot != null) {
                val value = tempRoot.`val`
                tempRoot = if (value == `val`) {
                    break
                } else if (value < `val`) {
                    tempRoot.right
                } else {
                    tempRoot.left
                }
            }
            return tempRoot
        }
    }
}