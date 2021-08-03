package easy

class ImplementStrStrSolution {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) {
            return 0
        }
        val haystackLength = haystack.length
        val needleLength = needle.length
        if (haystackLength < needleLength) {
            return -1
        }
        if (haystackLength == needleLength) {
            return if (haystack == needle) {
                0
            } else {
                -1
            }
        }
        for (i in 0 .. haystack.length - needle.length) {
            if (haystack[i] == needle[0]) {
                var match = true
                for (j in 1 until needle.length) {
                    if (haystack[i + j] != needle[j]) {
                        match = false
                        break
                    }
                }
                if (match) {
                    return i
                }
            }
        }
        return -1
    }
}