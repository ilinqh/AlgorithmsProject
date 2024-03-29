package easy

import kotlin.math.min

/**
 * 数据量不大的前提下，用双层 for 循环更加高效
 */
class _14LongestCommonPrefix {
    class Solution {
        private lateinit var strList: Array<String>
        fun longestCommonPrefix(strs: Array<String>): String {
            if (strs.isEmpty()) {
                return ""
            }
            strList = strs
            return searchCommonPrefix(0, strList.size - 1)
        }

        private fun searchCommonPrefix(left: Int, right: Int): String {
            if (left >= right) {
                return strList[left]
            }
            val middle = left + (right - left) / 2
            val lSub = searchCommonPrefix(left, middle)
            val rSub = searchCommonPrefix(middle + 1, right)
            val minLength = min(lSub.length, rSub.length)
            if (minLength == 0) {
                return ""
            }
            val sb = StringBuffer()
            for (i in 0 until minLength) {
                if (lSub[i] == rSub[i]) {
                    sb.append(lSub[i])
                } else {
                    break
                }
            }

            return sb.toString()
        }
    }

    // Beat

    class BestSolution {
        fun longestCommonPrefix(strs: Array<String>): String {
            val str: String
            if (strs.isNotEmpty()) {
                str = strs[0]
            } else {
                return ""
            }
            var startString = ""
            for (i in str.indices) {
                startString = str.substring(0, i + 1)
                for (s in strs) {
                    if (s.startsWith(startString)) {
                        continue
                    } else {
                        return startString.substring(0, i)
                    }
                }
            }
            return startString
        }
    }
}
