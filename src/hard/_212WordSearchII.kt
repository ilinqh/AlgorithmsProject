package hard


class _212WordSearchII {
    class Solution {
        var dirs = arrayOf(intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1))
        fun findWords(board: Array<CharArray>, words: Array<String>): List<String> {
            val trie = Trie()
            for (word in words) {
                trie.insert(word)
            }
            val ans: MutableSet<String> = HashSet()
            for (i in board.indices) {
                for (j in 0 until board[0].size) {
                    dfs(board, trie, i, j, ans)
                }
            }
            return ArrayList(ans)
        }

        private fun dfs(board: Array<CharArray>, tempNow: Trie?, i1: Int, j1: Int, ans: MutableSet<String>) {
            var now = tempNow
            if (!now!!.children.containsKey(board[i1][j1])) {
                return
            }
            val ch = board[i1][j1]
            now = now.children[ch]
            if ("" != now!!.word) {
                ans.add(now.word)
            }
            board[i1][j1] = '#'
            for (dir in dirs) {
                val i2 = i1 + dir[0]
                val j2 = j1 + dir[1]
                if (i2 >= 0 && i2 < board.size && j2 >= 0 && j2 < board[0].size) {
                    dfs(board, now, i2, j2, ans)
                }
            }
            board[i1][j1] = ch
        }
    }

    class Trie {
        var word = ""
        var children: MutableMap<Char, Trie> = HashMap()
        fun insert(word: String) {
            var cur: Trie = this
            for (element in word) {
                if (!cur.children.containsKey(element)) {
                    cur.children[element] = Trie()
                }
                cur = cur.children[element]!!
            }
            cur.word = word
        }

    }
}