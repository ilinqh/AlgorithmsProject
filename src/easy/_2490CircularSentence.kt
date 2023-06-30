package easy

class _2490CircularSentence {
    class Solution {
        fun isCircularSentence(sentence: String): Boolean {
            val array = sentence.split(' ')
            val length = array.size
            for (i in 0 until length) {
                if (array[i].last() != array[(i + 1) % length].first()) {
                    return false
                }
            }
            return true
        }
    }

    class BestSolution {
        fun isCircularSentence(sentence: String): Boolean {
            if (sentence.last() != sentence.first()) {
                return false
            }
            sentence.indices.forEach { i ->
                if (sentence[i] == ' ' && sentence[i - 1] != sentence[i + 1]) {
                    return false
                }
            }
            return true
        }
    }
}