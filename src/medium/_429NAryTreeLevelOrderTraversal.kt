package medium

class _429NAryTreeLevelOrderTraversal {
    class Node(var `val`: Int) {
        var children: List<Node?> = listOf()
    }

    class Solution {
        fun levelOrder(root: Node?): List<List<Int>> {
            if (root == null) {
                return emptyList()
            }
            val queue = java.util.ArrayDeque<Node?>()
            val result = ArrayList<List<Int>>()
            queue.offer(root)
            while (queue.isNotEmpty()) {
                val size = queue.size
                val subList = ArrayList<Int>()
                for (i in 0 until size) {
                    val item = queue.poll()
                    if (item != null) {
                        subList.add(item.`val`)
                        if (item.children.isNotEmpty()) {
                            for (j in item.children.indices) {
                                val child = item.children[j]
                                if (child != null) {
                                    queue.offer(child)
                                }
                            }
                        }
                    }
                }
                result.add(subList)
            }
            return result
        }
    }
}