package medium

class _187RepeatedDnaSequences {
    class Solution {
        fun findRepeatedDnaSequences(s: String): List<String> {
            val ans = ArrayList<String>()
            val map = HashMap<String, Int>()
            val length = s.length
            for (i in 0..(length - 10)) {
                val sub = s.substring(i, i + 10)
                map[sub] = map.getOrDefault(sub, 0) + 1
                if (map[sub] == 2) {
                    ans.add(sub)
                }
            }
            return ans
        }
    }

    class BestSolution {
        private val L = 10
        private val binMap = HashMap<Char, Int>().apply {
            this['A'] = 0
            this['C'] = 1
            this['G'] = 2
            this['T'] = 3
        }

        fun findRepeatedDnaSequences(s: String): List<String> {
            val ans = ArrayList<String>()
            val length = s.length
            if (length < L) {
                return ans
            }
            var x = 0
            for (i in 0 until 9) {
                x = (x shl 2) or binMap[s[i]]!!
            }
            val map = HashMap<Int, Int>()
            for (i in 0..(length - L)) {
                x = ((x shl 2) or binMap[s[i + L - 1]]!!) and ((1 shl (L * 2)) - 1)
                map[x] = map.getOrDefault(x, 0) + 1
                if (map[x] == 2) {
                    ans.add(s.substring(i, i + L))
                }
            }
            return ans
        }
    }
}