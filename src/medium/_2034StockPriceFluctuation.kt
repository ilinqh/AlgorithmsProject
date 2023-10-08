package medium

import java.util.*

class _2034StockPriceFluctuation {
    class StockPrice() {

        private var maxTime = 0
        private val map = HashMap<Int, Int>()
        private val pdMax = PriorityQueue<IntArray> { o1, o2 -> o2[0] - o1[0] }
        private val pdMin = PriorityQueue<IntArray> { o1, o2 -> o1[0] - o2[0] }

        fun update(timestamp: Int, price: Int) {
            maxTime = Math.max(maxTime, timestamp)

            map[timestamp] = price

            pdMax.offer(intArrayOf(price, timestamp))
            pdMin.offer(intArrayOf(price, timestamp))
        }

        fun current(): Int {
            return map[maxTime]!!
        }

        fun maximum(): Int {
            while (true) {
                val priceTime = pdMax.peek()
                val price = priceTime[0]
                val time = priceTime[1]
                if (map[time] == price) {
                    return priceTime[0]
                }
                pdMax.poll()
            }
        }

        fun minimum(): Int {
            while (true) {
                val priceTime = pdMin.peek()
                val price = priceTime[0]
                val time = priceTime[1]
                if (map[time] == price) {
                    return priceTime[0]
                }
                pdMin.poll()
            }
        }

    }
}