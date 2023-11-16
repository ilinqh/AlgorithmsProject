import easy._2103RingsAndRods
import easy._2760LongestEvenOddSubarrayWithThreshold
import solution_java.medium._318MaximumProductOfWordLengths
import java.math.BigInteger
import java.security.MessageDigest

fun printResult(solve: Any?) {
    solve ?: return
    when (solve) {
        is ListNode -> {
            solve.toArray().forEach {
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

fun md5(input: String): String {
    val md = MessageDigest.getInstance("MD5")
    val messageDigest = md.digest(input.toByteArray())
    val no = BigInteger(1, messageDigest)
    var hashText = no.toString(16)
    while (hashText.length < 32) {
        hashText = "0$hashText"
    }
    return hashText
}

data class Item(
    val name: String?,
    val age: Int = 1,
    val sex: Int = 1,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Item

        if (name != other.name) return false
        return sex == other.sex
    }

    override fun hashCode(): Int {
        var result = name?.hashCode() ?: 0
        result = 31 * result + sex
        return result
    }
}

fun main() {

    val root = TreeNode(1)
    val leftNode = TreeNode(3)
    val rightNode = TreeNode(2)
    root.left = leftNode
    leftNode.right = rightNode

    val solution = _2760LongestEvenOddSubarrayWithThreshold.Solution()
    val firstListNode = intArrayOf(1, 4, 3, 2, 5, 2).toListNode() ?: ListNode(1)
    val secondListNode = intArrayOf(1, 3, 4).toListNode() ?: ListNode(1)
    val thirdListNode = intArrayOf(2, 6).toListNode() ?: ListNode(1)
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
    val listNode = intArrayOf(1, 2, 3, 4, 5).toListNode()

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
        intArrayOf(1, 3, 1),
        intArrayOf(1, 5, 1),
        intArrayOf(4, 2, 1),
//        intArrayOf(0, 0, 0),
    )
//    val matrix = arrayOf(
//        intArrayOf(1, 4, 7, 11, 15),
//        intArrayOf(2, 5, 8, 12, 19),
//        intArrayOf(3, 6, 9, 16, 22),
//        intArrayOf(10, 13, 14, 17, 24),
//        intArrayOf(18, 21, 23, 26, 30)
//    )
//    val circularQueue = _622DesignCircularQueue.MyCircularQueue(3) // 设置长度为 3
//    circularQueue.enQueue(1) // 返回 true
//    circularQueue.enQueue(2) // 返回 true
//    circularQueue.enQueue(3) // 返回 true
//    circularQueue.enQueue(4) // 返回 false，队列已满
//    circularQueue.Rear() // 返回 3
//    circularQueue.isFull() // 返回 true
//    circularQueue.deQueue() // 返回 true
//    circularQueue.enQueue(4) // 返回 true
//    circularQueue.Rear() // 返回 4
    val treeRoot = arrayListOf(1, 2, 3, 4, null).toTreeNode()
    //[100,200,100],[200,50,200],[100,200,100]
//    [[5,10],[2,5],[4,7],[3,9]]
    // "abcde"
    //["a","bb","acd","ace"]
//    [[0,0],[1,1],[2,2],[3,4],[3,5],[4,4],[4,5]]
    val solve = solution.longestAlternatingSubarray(intArrayOf(4), 1)
//    printResult(md5("abcdefghj123456789xiguagame"))
//    val a = 1.inv()
//    val a = 1 xor 2
//
//    val arrayList = ArrayList<Item>()
//    arrayList.add(Item("name", 1, 1))
//    arrayList.add(Item("name1", 2, 2))
//    arrayList.add(Item("name", 3, 1))
    printResult(solve)
}
