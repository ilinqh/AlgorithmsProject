package easy

class Roman2IntegerSolution {
    fun romanToInt(s: String): Int {
        var preValue = getValue(s[0])
        var sum = 0
        for (index in 1 until s.length) {
            val curValue = getValue(s[index])
            if (preValue < curValue) {
                sum -= preValue
            } else {
                sum += preValue
            }
            preValue = curValue
        }
        sum += preValue
        return sum
    }

    private fun getValue(char: Char): Int {
        return when (char) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }
}