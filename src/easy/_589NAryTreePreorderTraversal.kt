package easy

class _589NAryTreePreorderTraversal {
    class Node(var `val`: Int) {
        var children: List<Node?> = listOf()
    }

    class Solution {
        private val ans = ArrayList<Int>()
        fun preorder(root: Node?): List<Int> {
            pOrder(root)
            return ans
        }

        private fun pOrder(node: Node?) {
            if (node == null) {
                return
            }
            ans.add(node.`val`)
            for (i in node.children.indices) {
                pOrder(node.children[i])
            }
        }
    }

    class OtherSolution {
        fun preorder(root: Node?): List<Int> {
            val ans = ArrayList<Int>()
            if (root == null) {
                return emptyList()
            }
            val deque = java.util.ArrayDeque<Node>()
            deque.add(root)
            while (deque.isNotEmpty()) {
                val top = deque.pop()
                ans.add(top.`val`)
                if (top.children.isNotEmpty()) {
                    for (i in (top.children.size - 1) downTo 0) {
                        val childNode = top.children[i]
                        if (childNode != null) {
                            deque.push(childNode)
                        }
                    }
                }
            }
            return ans
        }
    }
}