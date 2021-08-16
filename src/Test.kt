import easy._69SqrtX
import easy._88MergeSortedArray
import easy._94BinaryTreeInorderTraversal
import hard._233NumberOfDigitOne
import medium._18FourSum
import medium._22GenerateParentheses
import medium._24SwapNodesInPairs
import medium._526BeautifulArrangement

fun main() {

//    val root = TreeNode(1)
//    val rightNode = TreeNode(2)
//    val leftNode = TreeNode(3)
//    rightNode.left = leftNode
//    root.right = rightNode

    val solution = _24SwapNodesInPairs.Solution()
    val firstListNode = arrayToListNode(intArrayOf(1, 1, 2, 2, 9, 9, 9, 10, 11, 12)) ?: ListNode(1)
    val secondListNode = arrayToListNode(intArrayOf(5, 6))
//    val solve = solution.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4))
//    val solve = solution.threeSumClosest(intArrayOf(1, 1, -1, -1, 3), -1)
//    val solve = solution.fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0)
    val solve = solution.swapPairs(secondListNode)
//    print(solve)
    listNodeToArray(solve).forEach {
        print(it)
    }
//    solve.forEach {
//        println(it)
//    }
}
