package easy

import TreeNode

class _94BinaryTreeInorderTraversal {

    class Solution {
        fun inorderTraversal(root: TreeNode?): List<Int> {
            val result = ArrayList<Int>()
            if (root == null) {
                return result
            }
            traversal(root, result)
            return result
        }

        private fun traversal(node: TreeNode, result: ArrayList<Int>) {
            if (node.left != null) {
                traversal(node.left!!, result)
            }
            result.add(node.`val`)
            if (node.right != null) {
                traversal(node.right!!, result)
            }
        }
    }

    // Best
    class BestSolution {
        fun inorderTraversal(root: TreeNode?): List<Int> {
            val resultList = ArrayList<Int>()
            if (root == null) {
                return resultList
            }
            _inorderTraversal(root, resultList)
            return resultList
        }


        private fun _inorderTraversal(node: TreeNode, list: ArrayList<Int>) {
            if (node.left != null) {
                _inorderTraversal(node.left!!, list)
            }

            list.add(node.`val`)

            if (node.right != null) {
                _inorderTraversal(node.right!!, list)
            }
        }
    }
}