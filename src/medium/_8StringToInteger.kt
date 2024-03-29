package medium


class _8StringToInteger {

    class Solution {
        fun myAtoi(str: String): Int {
            val automaton = Automaton()
            for (item in str) {
                automaton[item]
            }
            return (automaton.sign * automaton.ans).toInt()
        }

        class Automaton {
            var sign = 1
            var ans = 0L
            private var state = "start"
            private val map = object : HashMap<String, Array<String>>() {
                init {
                    put("start", arrayOf("start", "sign", "in_number", "end"))
                    put("sign", arrayOf("end", "end", "in_number", "end"))
                    put("in_number", arrayOf("end", "end", "in_number", "end"))
                    put("end", arrayOf("end", "end", "end", "end"))
                }
            }

            operator fun get(c: Char) {
                state = map[state]!![getCol(c)]
                if (state == "sign") {
                    sign = if (c == '+') {
                        1
                    } else {
                        -1
                    }
                } else if (state == "in_number") {
                    ans = ans * 10 + c.code.toLong() - '0'.code.toLong()
                    ans = if (sign == 1) {
                        Math.min(ans, Int.MAX_VALUE.toLong())
                    } else {
                        Math.min(ans, -Int.MIN_VALUE.toLong())
                    }
                }
            }

            private fun getCol(c: Char): Int {
                if (c == ' ') {
                    return 0
                } else if (c == '+' || c == '-') {
                    return 1
                } else if (Character.isDigit(c)) {
                    return 2
                }
                return 3
            }
        }
    }

    // Best 状态机思想

    class BestSolution {
        fun myAtoi(str: String): Int {
            val automaton = Automaton()
            val length = str.length
            for (i in 0 until length) {
                automaton[str[i]]
            }
            return (automaton.sign * automaton.ans).toInt()
        }
    }

    class Automaton {
        var sign = 1
        var ans: Long = 0
        private var state = "start"
        private val table = object : HashMap<String, Array<String>>() {
            init {
                put("start", arrayOf("start", "signed", "in_number", "end"))
                put("signed", arrayOf("end", "end", "in_number", "end"))
                put("in_number", arrayOf("end", "end", "in_number", "end"))
                put("end", arrayOf("end", "end", "end", "end"))
            }
        }

        operator fun get(c: Char) {
            state = table[state]!![getCol(c)]
            if ("in_number" == state) {
                ans = ans * 10 + c.code.toLong() - '0'.code.toLong()
                ans = if (sign == 1) Math.min(ans, Int.MAX_VALUE.toLong()) else Math.min(ans, -Int.MIN_VALUE.toLong())
            } else if ("signed" == state) {
                sign = if (c == '+') 1 else -1
            }
        }

        private fun getCol(c: Char): Int {
            if (c == ' ') {
                return 0
            }
            if (c == '+' || c == '-') {
                return 1
            }
            return if (Character.isDigit(c)) {
                2
            } else 3
        }
    }

}