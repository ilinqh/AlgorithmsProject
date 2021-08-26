package easy

import java.util.*

class _155MinStack {
    class MinStack {

        /** initialize your data structure here. */
        private val stack = LinkedList<Int>()
        private val minStack = LinkedList<Int>()

        fun push(`val`: Int) {
            stack.push(`val`)
            val lastMin = minStack.peek() ?: Int.MAX_VALUE
            minStack.push(Math.min(lastMin, `val`))
        }

        fun pop() {
            stack.pop()
            minStack.pop()
        }

        fun top(): Int {
            return stack.peek()
        }

        fun getMin(): Int {
            return minStack.peek()
        }

    }
}