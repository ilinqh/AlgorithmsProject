package medium

class _77Combinations {
    class Solution {
        fun combine(n: Int, k: Int): List<List<Int>> {
            if (n == 0 || k == 0) {
                return emptyList()
            }
            val result = ArrayList<List<Int>>()
            val itemList = ArrayList<Int>()
            backtrace(result, itemList, 1, n, k)
            return result
        }

        private fun backtrace(result: MutableList<List<Int>>, itemList: MutableList<Int>, index: Int, n: Int, k: Int) {
            // 剪枝
            if (index - 1 + k - itemList.size > n) {
                return
            }
            if (itemList.size == k) {
                result.add(ArrayList(itemList))
                return
            }
            for (i in index..n) {
                itemList.add(i)
                backtrace(result, itemList, i + 1, n, k)
                itemList.removeAt(itemList.size - 1)
            }
        }
    }
}