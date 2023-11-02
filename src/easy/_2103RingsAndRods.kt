package easy

class _2103RingsAndRods {
    class Solution {
        fun countPoints(rings: String): Int {
            val array = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
            var lastIndex = -1
            for (i in rings.length - 1 downTo 0) {
                val ring = rings[i]
                if (i % 2 == 0) {
                    when (ring) {
                        'R' -> {
                            array[lastIndex] = array[lastIndex] or 1
                        }

                        'B' -> {
                            array[lastIndex] = array[lastIndex] or 2
                        }

                        'G' -> {
                            array[lastIndex] = array[lastIndex] or 4
                        }
                    }
                } else {
                    lastIndex = ring - '0'
                }
            }
            var result = 0
            for (item in array) {
                if (item == 7) {
                    result += 1
                }
            }
            return result
        }
    }
}