import java.util.*
import kotlin.collections.ArrayList

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
fun ArrayList<Int?>.toTreeNode(): TreeNode {
    val root = TreeNode(this[0] ?: 0)
    val queue = LinkedList<TreeNode?>()
    queue.add(root)
    var index = 1
    while (index < this.size) {
        val parent = queue.peek()
        queue.poll()

        val leftVal = this[index]
        val leftNode = if (leftVal == null) {
            null
        } else {
            TreeNode(leftVal)
        }
        parent?.left = leftNode
        queue.add(leftNode)
        index += 1
        if (index < this.size) {
            val rightVal = this[index]
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