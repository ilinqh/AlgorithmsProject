import hard._446ArithmeticSlicesII
import medium._15ThreeSum
import medium._16ThreeSumClosest
import medium._17LetterCombinationsOfAPhoneNumber
import medium._516LongestPalindromicSubsequence

fun main() {

    val solution = _17LetterCombinationsOfAPhoneNumber.Solution()
    val firstListNode = arrayToListNode(intArrayOf(1, 1, 2, 2, 9, 9, 9, 10, 11, 12)) ?: ListNode(1)
    val secondListNode = arrayToListNode(intArrayOf(5, 6, 4))
//    val solve = solution.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4))
//    val solve = solution.threeSumClosest(intArrayOf(1, 1, -1, -1, 3), -1)
    val solve = solution.letterCombinations("25")
    print(solve)
//    listNodeToArray(solve).forEach {
//        print(it)
//    }
//    solve.forEach {
//        println(it)
//    }
}
