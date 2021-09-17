package medium

import TreeNode

class _99RecoverBinarySearchTree {
    class Solution {
        fun recoverTree(root: TreeNode?) {
            val stack = ArrayDeque<TreeNode>()
            var pred: TreeNode? = null
            var x: TreeNode? = null
            var y: TreeNode? = null
            var tempRoot = root
            while (stack.isNotEmpty() || tempRoot != null) {
                while (tempRoot != null) {
                    stack.add(tempRoot)
                    tempRoot = tempRoot.left
                }
                tempRoot = stack.removeLast()
                if (pred != null && tempRoot.`val` < pred.`val`) {
                    y = tempRoot
                    if (x == null) {
                        x = pred
                    } else {
                        break
                    }
                }
                pred = tempRoot
                tempRoot = tempRoot.right
            }
            swap(x!!, y!!)
        }

        private fun swap(x: TreeNode, y: TreeNode) {
            val temp = x.`val`
            x.`val` = y.`val`
            y.`val` = temp
        }
    }


    class BestSolution {
        fun recoverTree(root: TreeNode?) {
            var x: TreeNode? = null
            var y: TreeNode? = null
            var pred: TreeNode? = null
            var predecessor: TreeNode?
            var tempRoot = root
            while (tempRoot != null) {
                if (tempRoot.left != null) {
                    predecessor = tempRoot.left!!
                    while (predecessor!!.right != null && predecessor.right != tempRoot) {
                        predecessor = predecessor.right
                    }

                    if (predecessor.right == null) {
                        predecessor.right = tempRoot
                        tempRoot = tempRoot.left
                    } else {
                        if (pred != null && tempRoot.`val` < pred.`val`) {
                            y = tempRoot
                            if (x == null) {
                                x = pred
                            }
                        }
                        pred = tempRoot

                        predecessor.right = null
                        tempRoot = tempRoot.right
                    }
                } else {
                    if (pred != null && tempRoot.`val` < pred.`val`) {
                        y = tempRoot
                        if (x == null) {
                            x = pred
                        }
                    }
                    pred = tempRoot
                    tempRoot = tempRoot.right
                }
            }
            swap(x!!, y!!)
        }

        private fun swap(x: TreeNode, y: TreeNode) {
            val temp = x.`val`
            x.`val` = y.`val`
            y.`val` = temp
        }
    }
}