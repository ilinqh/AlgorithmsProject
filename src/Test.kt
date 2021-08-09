import easy.*
import medium.*

fun main() {

    val solution = _83RemoveDuplicatesFromSortedList.Solution()
    val firstListNode = arrayToListNode(intArrayOf(2, 3, 3, 4, 4, 5)) ?: ListNode(1)
    val secondListNode = arrayToListNode(intArrayOf(5, 6, 4))
    val solve = solution.deleteDuplicates(firstListNode)
//    print(solve)
    listNodeToArray(solve).forEach {
        print(it)
    }
//    solve.forEach {
//        println(it)
//    }
}
