import easy._1221SplitAStringInBalancedStrings
import medium.*

fun main() {

    val root = TreeNode(2)
    val rightNode = TreeNode(-1)
    val leftNode = TreeNode(3)
    root.left = rightNode
//    root.right = rightNode

    val solution = _71SimplifyPath.Solution()
    val firstListNode = arrayToListNode(intArrayOf(1, 4, 5)) ?: ListNode(1)
    val secondListNode = arrayToListNode(intArrayOf(1, 3, 4)) ?: ListNode(1)
    val thirdListNode = arrayToListNode(intArrayOf(2, 6)) ?: ListNode(1)
//    val solve = solution.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4))
//    val solve = solution.threeSumClosest(intArrayOf(1, 1, -1, -1, 3), -1)
//    val solve = solution.fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0)
//    val solve = solution.searchRange(intArrayOf(1, 1, 2, 2, 9, 9, 9, 10, 11, 12), 10)
    val nodeArray = Array<ListNode?>(3) {
        ListNode(0)
    }
    nodeArray[0] = firstListNode
    nodeArray[1] = secondListNode
    nodeArray[2] = thirdListNode

    val array = Array(3) {
        IntArray(2)
    }
//    array[0] = intArrayOf(1, 2, 3, 4)
//    array[1] = intArrayOf(5, 6, 7, 8)
//    array[2] = intArrayOf(9, 10, 11, 12)
//    array[3] = intArrayOf(13, 14, 15, 16)
    array[0] = intArrayOf(1, 2)
    array[1] = intArrayOf(5, 6)
    array[2] = intArrayOf(1, 1)
    val listNode = arrayToListNode(intArrayOf(1, 2, 3, 4, 5))

    /**
     * n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
    src = 0, dst = 2, k = 1
     */
    val strs: Array<String> = arrayOf<String>("eat", "tea", "tan", "ate", "nat", "bat")
    val solve = solution.simplifyPath("/a/./b/../../c/")
    print(solve)
//    val a = 1.inv()
//    val a = 1 xor 2


//    listNodeToArray(solve).forEach {
//        print(" $it ")
//    }
//    solve.forEach {
//        print(" $it ")
//    }
//    solve.forEach {
//        it.forEach { i ->
//            print(" $i ")
//        }
//        println()
//    }
}
