import java.util.*

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun arrayToTreeNode(intArray: ArrayList<Int?>): TreeNode {
    val root = TreeNode(intArray[0] ?: 0)
    val queue = LinkedList<TreeNode?>()
    queue.add(root)
    var index = 1
    while (index < intArray.size) {
        val parent = queue.peek()
        queue.poll()

        val leftVal = intArray[index]
        val leftNode = if (leftVal == null) {
            null
        } else {
            TreeNode(leftVal)
        }
        parent?.left = leftNode
        queue.add(leftNode)
        index += 1
        if (index < intArray.size) {
            val rightVal = intArray[index]
            val rightNode = if (rightVal == null) {
                null
            } else {
                TreeNode(rightVal)
            }
            parent?.right = rightNode
            queue.add(rightNode)
        }
        index += 1
    }

    return root
}
