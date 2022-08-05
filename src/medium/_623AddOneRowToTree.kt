package medium

import TreeNode

class _623AddOneRowToTree {
    class Solution {
        fun addOneRow(root: TreeNode?, `val`: Int, depth: Int): TreeNode? {
            if (root == null) {
                return root
            }
            if (depth == 1) {
                val newRoot = TreeNode(`val`)
                newRoot.left = root
                return newRoot
            }
            var list = ArrayList<TreeNode>()
            var curDepth = 1
            list.add(root)
            while (curDepth < depth - 1) {
                curDepth += 1
                val tempList = ArrayList<TreeNode>()
                for (i in list.indices) {
                    val node = list[i]
                    node.left?.apply {
                        tempList.add(this)
                    }
                    node.right?.apply {
                        tempList.add(this)
                    }
                }
                list = tempList
            }
            for (i in list.indices) {
                val node = list[i]
                val left = node.left
                val newLeftNode = TreeNode(`val`)
                newLeftNode.left = left
                node.left = newLeftNode

                val right = node.right
                val newRightNode = TreeNode(`val`)
                newRightNode.right = right
                node.right = newRightNode
            }
            return root
        }
    }
}