package medium

class _2645MinimumAdditionsToMakeValidString {
    class Solution {
        fun addMinimum(word: String): Int {
            var top = 'c'
            var result = 0
            for (ch in word) {
                when (ch) {
                    'a' -> {
                        if (top == 'b') {
                            result += 1
                        } else if (top == 'a') {
                            result += 2
                        }
                    }

                    'b' -> {
                        if (top == 'c') {
                            result += 1
                        } else if (top == 'b') {
                            result += 2
                        }
                    }

                    'c' -> {
                        if (top == 'a') {
                            result += 1
                        } else if (top == 'c') {
                            result += 2
                        }
                    }
                }
                top = ch
            }
            if (top == 'a') {
                result += 2
            } else if (top == 'b') {
                result += 1
            }
            return result
        }
    }
}