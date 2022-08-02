package medium

class _622DesignCircularQueue {
    class MyCircularQueue(val k: Int) {

        private var head = 0
        private var tail = 0
        private val capacity = k + 1
        private val array: Array<Int?> = Array(capacity) { null }

        fun enQueue(value: Int): Boolean {
            if (isFull()) {
                return false
            }
            array[tail] = value
            tail = (tail + 1) % capacity
            return true
        }

        fun deQueue(): Boolean {
            if (isEmpty()) {
                return false
            }
            array[head] = null
            head = (head + 1) % capacity
            return true
        }

        fun Front(): Int {
            if (isEmpty()) {
                return -1
            }
            return array[head]!!
        }

        fun Rear(): Int {
            if (isEmpty()) {
                return -1
            }
            return array[(tail - 1 + capacity) % capacity]!!
        }

        fun isEmpty(): Boolean {
            return head == tail
        }

        fun isFull(): Boolean {
            return (tail + 1) % capacity == head
        }
    }
}