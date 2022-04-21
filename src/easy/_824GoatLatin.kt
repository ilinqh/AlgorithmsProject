package easy

class _824GoatLatin {
    class Solution {
        fun toGoatLatin(sentence: String): String {
            val sb = StringBuilder()
            val array = sentence.split(' ')
            for (i in array.indices) {
                if (i != 0) {
                    sb.append(' ')
                }
                val item = array[i]
                if (isStartWithAEIOU(item)) {
                    sb.append(item)
                } else {
                    sb.append(item.substring(1)).append(item.first())
                }
                sb.append("ma")
                for (j in 0..i) {
                    sb.append("a")
                }
            }
            return sb.toString()
        }

        private fun isStartWithAEIOU(str: String): Boolean {
            return str.startsWith('a')
                    || str.startsWith('A')
                    || str.startsWith('e')
                    || str.startsWith('E')
                    || str.startsWith('i')
                    || str.startsWith('I')
                    || str.startsWith('o')
                    || str.startsWith('O')
                    || str.startsWith('u')
                    || str.startsWith('U')
        }
    }
}