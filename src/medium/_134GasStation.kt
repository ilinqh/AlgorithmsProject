package medium

class _134GasStation {
    // 超时
    class BadSolution {
        fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
            var count: Int
            for (i in gas.indices) {
                count = gas[i] - cost[i]
                if (count < 0) {
                    continue
                }
                for (j in 1..cost.size) {
                    val realIndex = (i + j) % cost.size
                    if (realIndex == i) {
                        return i
                    }
                    count += gas[realIndex] - cost[realIndex]
                    if (count < 0) {
                        break
                    }
                }
            }
            return -1
        }
    }

    class Solution {
        fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
            val length = gas.size
            var count: Int
            var i = 0
            while (i < length) {
                var cnt = 0
                var sumOfGas = 0
                var sumOfCost = 0
                while (cnt < length) {
                    val j = (i + cnt) % length
                    sumOfGas += gas[j]
                    sumOfCost += cost[j]
                    if (sumOfCost > sumOfGas) {
                        break
                    }
                    cnt += 1
                }
                if (cnt == length) {
                    return i
                } else {
                    i += cnt + 1
                }
            }
            return -1
        }
    }
}