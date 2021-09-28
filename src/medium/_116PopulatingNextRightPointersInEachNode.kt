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
            val queue = LinkedList<Node>()
            root?.left?.let {
                queue.add(it)
            }
            root?.right?.let {
                queue.add(it)
            }
            while (queue.isNotEmpty()) {
                val queueSize = queue.size
                var head = queue.poll()
                for (i in 1 until queueSize) {
                    head.left?.let {
                        queue.add(it)
                    }
                    head.right?.let {
                        queue.add(it)
                    }
                    val current = queue.poll()
                    head.next = current
                    head = current
                }
            }
            return root
        }
    }
}