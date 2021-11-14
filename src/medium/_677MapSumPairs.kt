package medium

class _677MapSumPairs {
    class MapSum() {
        class TrieNode {
            var value = 0
            var next = arrayOfNulls<TrieNode>(26)
        }

        private val map = HashMap<String, Int>()
        private val root = TrieNode()

        fun insert(key: String, value: Int) {
            val delta = value - map.getOrDefault(key, 0)
            map[key] = value
            var node = root
            for (i in key) {
                if (node.next[i - 'a'] == null) {
                    node.next[i - 'a'] = TrieNode()
                }
                node = node.next[i - 'a']!!
                node.value += delta
            }
        }

        fun sum(prefix: String): Int {
            var node = root
            for (ch in prefix) {
                if (node.next[ch - 'a'] == null) {
                    return 0
                }
                node = node.next[ch - 'a']!!
            }
            return node.value
        }

    }
}