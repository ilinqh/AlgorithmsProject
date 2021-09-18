package easy

import TreeNode

class _108ConvertSortedArrayToBinarySearchTree {
    class Solution {
        fun sortedArrayToBST(nums: IntArray): TreeNode? {
            val left = 0
            val right = nums.size - 1
            return myBuildTree(nums, left, right)
        }

        private fun myBuildTree(nums: IntArray, left: Int, right: Int): TreeNode? {
            if (left > right) {
                return null
            }
            val middle = left + ((right - left) shr 1)
            val root = TreeNode(nums[middle])
            root.left = myBuildTree(nums, left, middle - 1)
            root.right = myBuildTree(nums, middle + 1, right)
            return root
        }
    }
}