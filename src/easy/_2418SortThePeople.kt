package easy

import java.util.*

class _2418SortThePeople {
    class Solution {
        fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
            val length = names.size
            val result = Array<String>(length) { "" }
            val indices = Array(length) { 0 }
            (0 until length).forEach { i ->
                indices[i] = i
            }
            Arrays.sort(indices) { o1, o2 ->
                heights[o2] - heights[o1]
            }
            (0 until length).forEach { i ->
                result[i] = names[indices[i]]
            }
            return result
        }
    }
}