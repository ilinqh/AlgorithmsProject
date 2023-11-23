package medium

class _1410HtmlEntityParser {
class Solution {
    fun entityParser(text: String): String {
        val map = mapOf(
            "&quot;" to '\"',
            "&apos;" to '\'',
            "&amp;" to '&',
            "&gt;" to '>',
            "&lt;" to '<',
            "&frasl;" to '/',
        )
        val sb = StringBuilder()
        val length = text.length
        var pos = 0
        var replace = false
        while (pos < length) {
            if (text[pos] == '&') {
                for (key in map.keys) {
                    if (pos + key.length <= length && text.substring(pos, pos + key.length) == key) {
                        replace = true
                        sb.append(map[key])
                        pos += key.length
                        break
                    }
                }
                if (replace) {
                    replace = false
                    continue
                }
            }
            sb.append(text[pos])
            pos += 1
        }
        return sb.toString()
    }
}
}