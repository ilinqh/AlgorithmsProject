import medium._2AddTwoNumbers

fun main() {

    val solution = _2AddTwoNumbers.Solution()
    val firstListNode = arrayToListNode(intArrayOf(2, 4, 3))
    val secondListNode = arrayToListNode(intArrayOf(5, 6, 4))
    val solve = solution.addTwoNumbers(firstListNode, secondListNode)
    listNodeToArray(solve).forEach {
        print(it)
    }
//    solve.forEach {
//        println(it)
//    }
}
