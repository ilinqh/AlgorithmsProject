package easy

class _232ImplementQueueUsingStacks {
    class MyQueue() {

        private val inDeque = ArrayDeque<Int>()
        private val outDeque = ArrayDeque<Int>()

        fun push(x: Int) {
            inDeque.add(x)
        }

        fun pop(): Int? {
            if (outDeque.isEmpty()) {
                in2out()
            }
            if (outDeque.isEmpty()) {
                return null
            }
            return outDeque.removeLast()
        }

        fun peek(): Int? {
            if (outDeque.isEmpty()) {
                in2out()
            }
            if (outDeque.isEmpty()) {
                return null
            }
            return outDeque.last()
        }

        fun empty(): Boolean {
            return inDeque.isEmpty() && outDeque.isEmpty()
        }

        private fun in2out() {
            while (inDeque.isNotEmpty()) {
                outDeque.add(inDeque.removeLast())
            }
        }
    }
}