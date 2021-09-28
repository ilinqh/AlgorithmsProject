package medium

import java.util.*

class Node(var `val`: Int) {
    var left: Node? = null
    var right: Node? = null
    var next: Node? = null
}

class _116PopulatingNextRightPointersInEachNode {
    class Solution {
        fun connect(root: Node?): Node? {
            if (root == null) {
                return root
            }
            val queue = LinkedList<Node>()
            queue.offer(root)
            while (queue.isNotEmpty()) {
                val queueSize = queue.size
                for (i in 0 until queueSize) {
                    val head = queue.poll()
                    head.left?.let {
                        queue.offer(it)
                    }
                    head.right?.let {
                        queue.offer(it)
                    }
                    if (i < queueSize - 1) {
                        head.next = queue.peek()
                    }
                }
            }
            return root
        }
    }

    class BestSolution {
        fun connect(root: Node?): Node? {
            if (root == null) {
                return null
            }
            var leftmost = root
            while (leftmost?.left != null) {
                var head = leftmost
                while (head != null) {
                    head.left!!.next = head.right
                    if (head.next != null) {
                        head.right?.next = head.next!!.left
                    }
                    head = head.next
                }
                leftmost = leftmost.left
            }
            return root
        }
    }
}