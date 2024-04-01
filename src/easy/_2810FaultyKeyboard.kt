package easy

class _2810FaultyKeyboard {
    class Solution {
        fun finalString(s: String): String {
            val pq = ArrayDeque<Char>()
            var head = false
            for (ch in s) {
                if (ch == 'i') {
                    head = !head
                    continue
                }
                if (head) {
                    pq.addFirst(ch)
                } else {
                    pq.addLast(ch)
                }
            }
            val sb = StringBuilder()
            if (head) {
                while (pq.isNotEmpty()) {
                    sb.append(pq.removeLast())
                }
            } else {
                while (pq.isNotEmpty()) {
                    sb.append(pq.removeFirst())
                }
            }
            return sb.toString()
        }
    }
}