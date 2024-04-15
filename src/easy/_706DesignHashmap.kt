package easy

import java.util.*

class _706DesignHashmap {
    class MyHashMap() {

        inner class MyPair(var key: Int, var value: Int)

        private val BASE = 769
        private val data = LinkedList<LinkedList<MyPair>>()

        init {
            for (i in 0 until BASE) {
                data.addLast(LinkedList())
            }
        }

        fun put(key: Int, value: Int) {
            val hashKey = hash(key)
            val iterator = data[hashKey].iterator()
            while (iterator.hasNext()) {
                val pair = iterator.next()
                if (pair.key == key) {
                    pair.value = value
                    return
                }
            }
            data[hashKey].addLast(MyPair(key, value))
        }

        fun get(key: Int): Int {
            val hashKey = hash(key)
            val iterator = data[hashKey].iterator()
            while (iterator.hasNext()) {
                val pair = iterator.next()
                if (pair.key == key) {
                    return pair.value
                }
            }
            return -1
        }

        fun remove(key: Int) {
            val hashKey = hash(key)
            val iterator = data[hashKey].iterator()
            while (iterator.hasNext()) {
                val pair = iterator.next()
                if (pair.key == key) {
                    data[hashKey].remove(pair)
                    return
                }
            }
        }

        private fun hash(key: Int): Int {
            return key % BASE
        }
    }

}