package hard

class _440KThSmallestInLexicographicalOrder {
class Solution {
    fun findKthNumber(n: Int, k: Int): Int {
        var curr = 1
        var tempK = k - 1
        while (tempK > 0) {
            val step = getSteps(curr, n.toLong())
            if (step <= tempK) {
                tempK -= step
                curr += 1
            } else {
                curr *= 10
                tempK -= 1
            }
        }
        return curr
    }

    private fun getSteps(curr: Int, n: Long): Int {
        var step = 0L
        var first: Long = curr.toLong()
        var last: Long = curr.toLong()
        while (first <= n) {
            step += Math.min(last, n) - first + 1
            first *= 10
            last = last * 10 + 9
        }
        return step.toInt()
    }
}
}