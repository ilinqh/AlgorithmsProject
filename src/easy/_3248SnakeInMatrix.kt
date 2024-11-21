package easy

class _3248SnakeInMatrix {
    class Solution {
        fun finalPositionOfSnake(n: Int, commands: List<String>): Int {
            var result = 0
            for (command in commands) {
                when (command) {
                    "UP" -> {
                        result -= n
                    }

                    "RIGHT" -> {
                        result += 1
                    }

                    "DOWN" -> {
                        result += n
                    }

                    "LEFT" -> {
                        result -= 1
                    }
                }
            }
            return result
        }
    }
}