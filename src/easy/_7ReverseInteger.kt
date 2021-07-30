package easy

class ReverseIntegerSolution {
    fun reverse(x: Int): Int {
        var sum = 0
        var tempX = x
        while (tempX != 0) {
            if ((sum * 10L) > Int.MAX_VALUE || (sum * 10L) < Int.MIN_VALUE) {
                return 0
            }
            sum = sum * 10 + tempX % 10
            tempX /= 10
        }
        return sum
    }
}