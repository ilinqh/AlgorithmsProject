package medium

class _622DesignCircularQueue {
    class MyCircularQueue(val k: Int) {

        private val array: IntArray = IntArray(k)

        fun enQueue(value: Int): Boolean {
            return true
        }

        fun deQueue(): Boolean {
            if (isEmpty()) {
                return false
            }
            return true
        }

        fun Front(): Int {
            return -1
        }

        fun Rear(): Int {
            return -1
        }

        fun isEmpty(): Boolean {
            return false
        }

        fun isFull(): Boolean {
            return true
        }

    }
}