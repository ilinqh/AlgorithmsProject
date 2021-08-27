package easy

import TreeNode

class _235LowestCommonAncestorOfABinarySearchTree {
    class Solution {
        fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
            if (root == null || p == null || q == null) {
                return null
            }
            var ancestor = root
            while (true) {
                ancestor = if (p.`val` < ancestor!!.`val` && q.`val` < ancestor.`val`) {
                    ancestor.left
                } else if (p.`val` > ancestor.`val` && q.`val` > ancestor.`val`) {
                    ancestor.right
                } else {
                    break
                }
            }
            return ancestor
        }
    }
}