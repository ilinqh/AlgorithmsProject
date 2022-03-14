package easy

class _599MinimumIndexSumOfTwoLists {
    class Solution {
        fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
            val map = HashMap<String, Int>()
            for (i in list1.indices) {
                map[list1[i]] = i
            }
            val ans = ArrayList<String>()
            var minSum = Int.MAX_VALUE
            for (i in list2.indices) {
                if (map.containsKey(list2[i])) {
                    val listIndex = map[list2[i]]!!
                    if (minSum > (listIndex + i)) {
                        ans.clear()
                        ans.add(list2[i])
                        minSum = listIndex + i
                    } else if (listIndex + i == minSum) {
                        ans.add(list2[i])
                    }
                }
            }
            return ans.toArray(Array<String>(ans.size) { "" })
        }
    }
}