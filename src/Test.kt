import easy._345ReverseVowelsOfAString
import easy._551StudenAttendanceRecordI
import hard._52EightQueenII
import medium.*

fun main() {

//    val root = TreeNode(1)
//    val rightNode = TreeNode(2)
//    val leftNode = TreeNode(3)
//    rightNode.left = leftNode
//    root.right = rightNode

    val solution = _39CombinationSum.Solution()
    val firstListNode = arrayToListNode(intArrayOf(1, 1, 2, 2, 9, 9, 9, 10, 11, 12)) ?: ListNode(1)
    val secondListNode = arrayToListNode(intArrayOf(5, 6))
//    val solve = solution.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4))
//    val solve = solution.threeSumClosest(intArrayOf(1, 1, -1, -1, 3), -1)
//    val solve = solution.fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0)
//    val solve = solution.searchRange(intArrayOf(1, 1, 2, 2, 9, 9, 9, 10, 11, 12), 10)
    val solve = solution.combinationSum(intArrayOf(3), 2)
    print(solve)
//    val a = 1.inv()
//    val a = 1 xor 2


//    listNodeToArray(solve).forEach {
//        print(it)
//    }
//    solve.forEach {
//        print(it)
//    }
}
