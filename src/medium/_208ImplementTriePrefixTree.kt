package medium

class _208ImplementTriePrefixTree {
    class Trie() {
        private var children = arrayOfNulls<Trie>(26)
        private var isEnd = false

        fun insert(word: String) {
            var node = this
            for (i in word.indices) {
                val ch = word[i]
                val index = ch - 'a'
                if (node.children[index] == null) {
                    node.children[index] = Trie()
                }
                node = node.children[index]!!
            }
            node.isEnd = true
        }

        fun search(word: String): Boolean {
            val node = searchPrefix(word)
            return node != null && node.isEnd
        }

        fun startsWith(prefix: String): Boolean {
            val node = searchPrefix(prefix)
            return node != null
        }

        private fun searchPrefix(prefix: String): Trie? {
            var node = this
            for (i in prefix.indices) {
                val ch = prefix[i]
                val index = ch - 'a'
                if (node.children[index] == null) {
                    return null
                }
                node = node.children[index]!!
            }
            return node
        }
    }
}