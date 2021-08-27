package hard

import java.util.*

class _295FindMedianFromDataStream {
    class MedianFinder() {

        private val maxHeap = PriorityQueue<Int> { a, b -> b - a }
        private val minHeap = PriorityQueue<Int> { a, b -> a - b }

        fun addNum(num: Int) {
            val maxHeapSize = maxHeap.size
            val minHeapSize = minHeap.size
            if (maxHeapSize == minHeapSize) {
                if (minHeap.isEmpty() || num <= minHeap.peek()) {
                    maxHeap.add(num)
                } else {
                    maxHeap.add(minHeap.poll())
                    minHeap.add(num)
                }
            } else {
                if (maxHeap.peek() <= num) {
                    minHeap.add(num)
                } else {
                    minHeap.add(maxHeap.poll())
                    maxHeap.add(num)
                }
            }
        }

        fun findMedian(): Double {
            val maxHeapSize = maxHeap.size
            val minHeapSize = minHeap.size
            return if (maxHeapSize == minHeapSize) {
                maxHeap.peek() + (minHeap.peek() - maxHeap.peek()) / 2.0
            } else {
                maxHeap.peek().toDouble()
            }
        }
    }
}