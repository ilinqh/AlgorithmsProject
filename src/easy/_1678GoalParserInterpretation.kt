package easy

class _1678GoalParserInterpretation {
    class Solution {
        fun interpret(command: String): String {
            val sb = StringBuilder()
            for (i in command.indices) {
                val ch = command[i]
                if (ch == 'G') {
                    sb.append(ch)
                } else if (ch == '(') {
                    if (command[i + 1] == ')') {
                        sb.append('o')
                    } else {
                        sb.append("al")
                    }
                }
            }
            return sb.toString()
        }
    }
}