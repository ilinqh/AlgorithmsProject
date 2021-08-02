package easy

import java.util.*

/**
 * LinkedList 底层是链表实现，对于增删元素也很方便，用 LinkedList 会更加高效
 */
class ValidParenthesesSolution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (char in s) {
            when (char) {
                '(','[','{' -> stack.push(char)
                ')' -> {
                    if (stack.isEmpty()) {
                        return false
                    }
                    val top = stack.peek()
                    if (top == '(') {
                        stack.pop()
                    } else {
                        return false
                    }
                }
                ']' -> {
                    if (stack.isEmpty()) {
                        return false
                    }
                    val top = stack.peek()
                    if (top == '[') {
                        stack.pop()
                    } else {
                        return false
                    }
                }
                '}' -> {
                    if (stack.isEmpty()) {
                        return false
                    }
                    val top = stack.peek()
                    if (top == '{') {
                        stack.pop()
                    } else {
                        return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }
}

// Best

class ValidParenthesesBestSolution {
    fun isValid(s: String): Boolean {
        if (s.length % 2 != 0) {
            return false
        }
        val linkedList = LinkedList<Char>()
        s.forEach {
            if (it == '(' || it == '{' || it == '[') {
                linkedList.push(it)
            } else {
                if (linkedList.isEmpty()) {
                    return false
                }
                val pop = linkedList.pop()
                val b = (it == ')' && pop == '(') || (it == '}' && pop == '{') || (it == ']' && pop == '[')
                if (!b) {
                    return false
                }
            }
        }
        return linkedList.isEmpty()
    }
}