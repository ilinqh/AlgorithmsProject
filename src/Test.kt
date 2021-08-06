import medium.*

fun main() {

    val solution = _5LongestPalindromicSubstring.Solution()
    val firstListNode = arrayToListNode(intArrayOf(2, 4, 3))
    val secondListNode = arrayToListNode(intArrayOf(5, 6, 4))
    val solve = solution.longestPalindrome("cccc")
    print(solve)
//    listNodeToArray(solve).forEach {
//        print(it)
//    }
//    solve.forEach {
//        println(it)
//    }
}
