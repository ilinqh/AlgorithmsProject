class ListNode {
    var `val` = 0
    var next: ListNode? = null

    constructor(`val`: Int) {
        this.`val` = `val`
    }

    constructor(`val`: Int, next: ListNode?) {
        this.`val` = `val`
        this.next = next
    }
}

fun IntArray.toListNode(): ListNode? {
    val preHead = ListNode(-1)
    var prev = preHead
    this.forEach {
        prev.next = ListNode(it)
        prev = prev.next!!
    }
    return preHead.next
}

fun ListNode?.toArray(): IntArray {
    val intArray = ArrayList<Int>()
    var listNode = this
    while (listNode != null) {
        intArray.add(listNode.`val`)
        listNode = listNode.next
    }
    return intArray.toIntArray()
}