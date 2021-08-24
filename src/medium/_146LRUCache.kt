package medium

class _146LRUCache {
    class LRUCache(private val capacity: Int) {
        class DLinkedNode {
            constructor()
            constructor(_key: Int, _value: Int) {
                key = _key
                value = _value
            }

            var key: Int = 0
            var value: Int = 0
            var prev: DLinkedNode? = null
            var next: DLinkedNode? = null
        }

        private val cache = HashMap<Int, DLinkedNode>()
        private var size: Int = 0
        private var head = DLinkedNode()
        private var tail = DLinkedNode()

        init {
            head.next = tail
            tail.prev = head
        }

        fun get(key: Int): Int {
            val node = cache[key] ?: return -1
            moveToHead(node)
            return node.value
        }

        fun put(key: Int, value: Int) {
            val node = cache[key]
            if (node == null) {
                val newNode = DLinkedNode(key, value)
                cache[key] = newNode
                size++
                addToHead(newNode)
                if (size > capacity) {
                    val tailNode = removeTail()
                    cache.remove(tailNode.key)
                    size--
                }
            } else {
                node.value = value
                moveToHead(node)
            }
        }

        private fun moveToHead(node: DLinkedNode) {
            removeNode(node)
            addToHead(node)
        }

        private fun removeNode(node: DLinkedNode) {
            node.prev!!.next = node.next
            node.next!!.prev = node.prev
        }

        private fun addToHead(node: DLinkedNode) {
            node.prev = head
            node.next = head.next
            head.next!!.prev = node
            head.next = node
        }

        private fun removeTail(): DLinkedNode {
            val tailNode = tail.prev!!
            removeNode(tailNode)
            return tailNode
        }

    }
}