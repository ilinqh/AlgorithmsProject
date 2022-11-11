package easy

class _1704DetermineIfStringHalvesAreAlike {
    class Solution {
        fun halvesAreAlike(s: String): Boolean {
            val alike = arrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
            val middle = s.length / 2
            val head = s.substring(0, middle)
            val tail = s.substring(middle)
            var count = 0

            for (ch in head) {
                val index = alike.indexOf(ch)
                if (index > -1) {
                    count += 1
                }
            }
            for (ch in tail) {
                val index = alike.indexOf(ch)
                if (index > -1) {
                    count -= 1
                }
            }
            return count == 0
        }
    }
}