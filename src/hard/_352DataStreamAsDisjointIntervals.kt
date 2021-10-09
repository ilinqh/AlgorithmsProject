package hard

class _352DataStreamAsDisjointIntervals {
    class SummaryRanges() {
        val list = ArrayList<IntArray>()
        fun addNum(`val`: Int) {
            val n = list.size
            if (n == 0) {
                list.add(intArrayOf(`val`, `val`))
                return
            }
            var left = 0
            var right = n - 1
            while (left < right) {
                val middle = (left + right + 1) shr 1
                if (list[middle][0] <= `val`) {
                    left = middle
                } else {
                    right = middle - 1
                }
            }
            val cur = list[right]
            if (cur[0] > `val`) {
                if (`val` + 1 == cur[0]) {
                    cur[0] = `val`
                } else {
                    list.add(right, intArrayOf(`val`, `val`))
                }
                return
            }
            if (cur[0] <= `val` && `val` <= cur[1]) {
                // pass
            } else if (right == n - 1) {
                if (cur[1] + 1 == `val`) {
                    cur[1] = `val`
                } else {
                    list.add(intArrayOf(`val`, `val`))
                }
            } else {
                val next = list[right + 1]
                if (cur[1] + 1 == `val` && `val` == next[0] - 1) {
                    cur[1] = next[1]
                    list.removeAt(right + 1)
                } else if (cur[1] + 1 == `val`) {
                    cur[1] = `val`
                } else if (next[0] - 1 == `val`) {
                    next[0] = `val`
                } else {
                    list.add(right + 1, intArrayOf(`val`, `val`))
                }
            }
        }

        fun getIntervals(): Array<IntArray> {
            val ans = Array(list.size) {
                IntArray(2)
            }
            for (i in list.indices) {
                ans[i] = list[i]
            }
            return ans
        }

    }
}