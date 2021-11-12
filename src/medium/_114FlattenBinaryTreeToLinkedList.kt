package medium

import TreeNode

class _114FlattenBinaryTreeToLinkedList {
    class Solution {
        fun flatten(root: TreeNode?) {
            var curr = root
            while (curr != null) {
                if (curr.left != null) {
                    val next = curr.left
                    var predecessor = next
                    while (predecessor?.right != null) {
                        predecessor = predecessor.right
                    }
                    predecessor?.right = curr.right
                    curr.left = null
                    curr.right = next
                }
                curr = curr.right
            }
        }
    }
}