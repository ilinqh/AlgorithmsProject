package medium

class _816AmbiguousCoordinates {
    class Solution {
        fun ambiguousCoordinates(s: String): List<String> {
            val ans = ArrayList<String>()
            val tempS = s.replace("(", "").replace(")", "")
            for (i in 1 until tempS.length) {
                val leftArray = getArray(tempS.substring(0, i))
                if (leftArray.isEmpty()) {
                    continue
                }
                val rightArray = getArray(tempS.substring(i, tempS.length))
                if (rightArray.isEmpty()) {
                    continue
                }
                for (l in leftArray.indices) {
                    val left = leftArray[l]
                    for (r in rightArray.indices) {
                        val right = rightArray[r]
                        ans.add("(${left}, ${right})")
                    }
                }
            }
            return ans
        }

        private fun getArray(str: String): List<String> {
            val array = arrayListOf<String>()
            if (str[0] != '0' || "0" == str) {
                array.add(str)
            }
            for (i in 1 until str.length) {
                if ((i != 1 && str[0] == '0') || str[str.length - 1] == '0') {
                    continue
                }
                array.add(str.substring(0, i) + '.' + str.substring(i))
            }
            return array
        }
    }
}