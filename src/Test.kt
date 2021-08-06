import medium.*

fun main() {

    val solution = _6ZigZagConversion.Solution()
    val firstListNode = arrayToListNode(intArrayOf(2, 4, 3))
    val secondListNode = arrayToListNode(intArrayOf(5, 6, 4))
    val solve = solution.convert("a", 1)
    print(solve)
//    listNodeToArray(solve).forEach {
//        print(it)
//    }
//    solve.forEach {
//        println(it)
//    }
}
