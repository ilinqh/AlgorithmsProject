import easy._83RemoveDuplicatesFromSortedList

fun main() {

    val solution = _83RemoveDuplicatesFromSortedList.Solution()
    val firstListNode = arrayToListNode(intArrayOf(1, 1, 2, 2, 9, 9, 9, 10, 11, 12)) ?: ListNode(1)
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
