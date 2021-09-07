package medium

import java.util.*

class _71SimplifyPath {
    class Solution {
        fun simplifyPath(path: String): String {
            if (path.isEmpty()) {
                return "/"
            }
            val array = path.split("/")
            val list = LinkedList<String>()
            for (i in array.indices) {
                val item = array[i]
                if (item.isEmpty() || item == ".") {
                    continue
                } else if (item == "..") {
                    if (list.isNotEmpty()) {
                        list.pollLast()
                    }
                } else {
                    list.offer(item)
                }
            }
            val sb = StringBuffer("/")
            for (i in list.indices) {
                val item = list.pollFirst()
                sb.append(item)
                if (list.isNotEmpty()) {
                    sb.append("/")
                }
            }
            return sb.toString()
        }
    }
}