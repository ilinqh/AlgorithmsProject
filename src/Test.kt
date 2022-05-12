import easy._944DeleteColumnsToMakeSorted
import medium._417PacificAtlanticWaterFlow

fun printResult(solve: Any) {
    when (solve) {
        is ListNode -> {
            listNodeToArray(solve).forEach {
                print(" $it ")
            }
        }
        is Array<*> -> {
            solve.forEach {
                when (it) {
                    is Array<*> -> {
                        it.forEach { i ->
                            print(" $i ")
                        }
                    }
                    is IntArray -> {
                        it.forEach { i ->
                            print(" $i ")
                        }
                        println()
                    }
                    else -> {
                        print(" $it ")
                    }
                }
            }
        }
        is IntArray -> {
            solve.forEach {
                print(" $it ")
            }
        }
        else -> {
            print(solve)
        }
    }
}

fun main() {

    val root = TreeNode(1)
    val leftNode = TreeNode(3)
    val rightNode = TreeNode(2)
    root.left = leftNode
    leftNode.right = rightNode

    val solution = _944DeleteColumnsToMakeSorted.Solution()
    val firstListNode = arrayToListNode(intArrayOf(1, 4, 3, 2, 5, 2)) ?: ListNode(1)
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

    val array = Array(1) {
        IntArray(4)
    }
//    array[0] = intArrayOf(1, 2, 3, 4)
//    array[1] = intArrayOf(5, 6, 7, 8)
//    array[2] = intArrayOf(9, 10, 11, 12)
//    array[3] = intArrayOf(13, 14, 15, 16)
    array[0] = intArrayOf(1, 3)
//    array[1] = intArrayOf(10,11,16,20)
//    array[2] = intArrayOf(23,30,34,60)
//    array[1] = intArrayOf(5, 6)
//    array[2] = intArrayOf(1, 1)
    val listNode = arrayToListNode(intArrayOf(1, 2, 3, 4, 5))

    /**
     * n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
    src = 0, dst = 2, k = 1
     */
    val strs: Array<String> = arrayOf<String>("eat", "tea", "tan", "ate", "nat", "bat")
//    [['A','B','C','E'],['S','F','C','S'],['A','D','E','E']], word = "ABCCED"
    val board =
        arrayOf(
            charArrayOf('A', 'B', 'C', 'E'),
            charArrayOf('S', 'F', 'C', 'S'),
            charArrayOf('A', 'D', 'E', 'E'),
        )
    val word = "ABCESCF"

    val boards = arrayOf(
        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9'),
    )
    val matrix = arrayOf(
        intArrayOf(0, 1, 0),
        intArrayOf(0, 0, 1),
        intArrayOf(1, 1, 1),
        intArrayOf(0, 0, 0),
    )
//    val matrix = arrayOf(
//        intArrayOf(1, 4, 7, 11, 15),
//        intArrayOf(2, 5, 8, 12, 19),
//        intArrayOf(3, 6, 9, 16, 22),
//        intArrayOf(10, 13, 14, 17, 24),
//        intArrayOf(18, 21, 23, 26, 30)
//    )
    val treeRoot = arrayToTreeNode(arrayListOf(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1))
    //[100,200,100],[200,50,200],[100,200,100]
    val solve = solution.minDeletionSize(arrayOf("zyx","wvu","tsr"))
    printResult(solve)
//    val a = 1.inv()
//    val a = 1 xor 2

}
