import easy.*
import hard._4MedianOfTwoSortedArrays
import medium.*

fun main() {

//    val root = TreeNode(1)
//    val rightNode = TreeNode(2)
//    val leftNode = TreeNode(3)
//    rightNode.left = leftNode
//    root.right = rightNode

    val solution = _4MedianOfTwoSortedArrays.Solution()
    val firstListNode = arrayToListNode(intArrayOf(1, 1, 2, 2, 9, 9, 9, 10, 11, 12)) ?: ListNode(1)
    val secondListNode = arrayToListNode(intArrayOf(5, 6))
//    val solve = solution.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4))
//    val solve = solution.threeSumClosest(intArrayOf(1, 1, -1, -1, 3), -1)
//    val solve = solution.fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0)
//    val solve = solution.searchRange(intArrayOf(1, 1, 2, 2, 9, 9, 9, 10, 11, 12), 10)
    val array = Array(3) {
        IntArray(3)
    }
    array[0] = intArrayOf(1, 2, 10)
    array[1] = intArrayOf(2, 2, 20)
    array[2] = intArrayOf(4, 5, 25)
//    array[3] = intArrayOf(13, 14, 15, 16)
    val listNode = arrayToListNode(intArrayOf(1,2,3,4,5))

    /**
     * n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
    src = 0, dst = 2, k = 1
     */
    val solve = solution.findMedianSortedArrays(intArrayOf(2), intArrayOf())
    print(solve)
//    val a = 1.inv()
//    val a = 1 xor 2


//    listNodeToArray(solve).forEach {
//        print(it)
//    }
//    solve.forEach {
//        print(" $it ")
//    }
//    solve.forEach {
//        it.forEach { i ->
//            print(i)
//        }
//    }
}
