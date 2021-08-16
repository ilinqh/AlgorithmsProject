class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun arrayToTreeNode(intArray: ArrayList<Int?>): TreeNode? {
    val root: TreeNode = TreeNode(intArray[0] ?: 0)
    for (index in 0 until (intArray.size / 2)) {
        val leftVal = intArray[index * 2 + 1]
        if (index == 0) {
            root.left = if (leftVal == null) {
                null
            } else {
                TreeNode(leftVal)
            }
        }
        val rightVal = intArray[(index + 1) * 2]
        if (index == 0) {
            root.right = if (rightVal == null) {
                null
            } else {
                TreeNode(rightVal)
            }
        }
    }

    return root
}
